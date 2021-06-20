/**
 * Un periódico quiere tener un registro de las noticias que publica.
 * Cada edición incluye noticias, editoriales, viñetas y reportajes.
 * También se guardarán los anuncios que se publican, guardando el nombre del anunciante, la página y espacio donde se publica.
 * Una noticia tiene autor, titular y contenido.
 * Una editorial tiene autor y contenido.
 * Una viñeta tiene autor y código de la imagen de tipo texto.
 * Un reportaje tiene autor, contenido y fotos.
 * Cada edición guarda su numero, fecha y páginas.
 * Resolver:
 * Muestra todo el contenido de una edición preguntando su fecha.
 * Muestra todo lo publicado por un autor
 * Muestra si un autor ha realizado algún trabajo en una edición preguntando por el número de la edición.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    //Array principal de ediciones donde voy a tener todos los datos de las ediciones guardados
    static ArrayList<Edicion> ediciones = new ArrayList<>();

    public static void main(String[] args) {
        //Llamo a un método para cargar todos los datos en el Array principal de ediciones
        Utilidades.crearEdiciones();

        Scanner sc = new Scanner(System.in);

        //Resolver:

        mostrarEdicionPorFecha(sc);

        mostrarPublicacionesPorAutor(sc);

        mostrarSiAutorRealizoTrabajoEnEdicion(sc);
    }

    //Muestro todo el contenido de una edición preguntando su fecha
    private static void mostrarEdicionPorFecha(Scanner sc) {
        System.out.print("Ingrese una fecha (dd-mm-aaaa): ");
        String fecha = sc.nextLine();

        //Con un bucle recorro cada edicion para buscar la fecha que coincida
        for (Edicion edicion : ediciones) {
            if (edicion.getFecha().equals(fecha)) {

                //Si la fecha de la edicion coincide con la fecha buscada, muestro la edicion
                Utilidades.mostrarEdicion(edicion);
            }
        }
    }

    //Muestro todo lo publicado por un autor
    private static void mostrarPublicacionesPorAutor(Scanner sc) {
        System.out.print("Ingrese un autor: ");
        String autor = sc.nextLine();

        //Con un bucle recorro cada edicion para buscar en su contenido al autor
        for (Edicion edicion : ediciones) {

            //utilizaré otros bucles for para recorrer los distintos arrays dentro de edicion
            for (Noticia noticia : edicion.getNoticias()) {
                if (noticia.getAutor().equals(autor)) {
                    Utilidades.mostrarNoticia(noticia);
                }
            }
            for (Editorial editorial : edicion.getEditoriales()) {
                if (editorial.getAutor().equals(autor)) {
                    Utilidades.mostrarEditorial(editorial);
                }
            }
            for (Vinieta vinieta : edicion.getVinietas()) {
                if (vinieta.getAutor().equals(autor)) {
                    Utilidades.mostrarVinieta(vinieta);
                }
            }
            for (Reportaje reportaje : edicion.getReportajes()) {
                if (reportaje.getAutor().equals(autor)) {
                    Utilidades.mostrarReportaje(reportaje);
                }
            }
        }
    }

    //Muestra si un autor ha realizado algún trabajo en una edición preguntando por el número de la edición.
    private static void mostrarSiAutorRealizoTrabajoEnEdicion(Scanner sc) {
        //Creo una variable booleana en false que convertiré a true solo si encuentro algun trabajo del autor en la edicion buscada
        boolean autorRealizoTrabajo = false;

        System.out.print("Ingrese un autor: ");
        String autor = sc.nextLine();

        System.out.print("Ingrese número de edicion: ");
        int numeroEdicio = sc.nextInt();
        sc.nextLine();

        //Con un bucle recorro cada edicion para buscar por su numero y luego por su autor
        for (Edicion edicion : ediciones) {

            //Primero verifico si el numero edición coincide con el numero buscado
            if (edicion.getNumero() == numeroEdicio) {

                //En caso que encuentre el número buscado paso a revisar si existen publicaciones del autor buscado
                for (Noticia noticia : edicion.getNoticias()) {
                    if (noticia.getAutor().equals(autor)) {
                        autorRealizoTrabajo = true;
                    }
                }
                for (Editorial editorial : edicion.getEditoriales()) {
                    if (editorial.getAutor().equals(autor)) {
                        autorRealizoTrabajo = true;
                    }
                }
                for (Vinieta vinieta : edicion.getVinietas()) {
                    if (vinieta.getAutor().equals(autor)) {
                        autorRealizoTrabajo = true;
                    }
                }
                for (Reportaje reportaje : edicion.getReportajes()) {
                    if (reportaje.getAutor().equals(autor)) {
                        autorRealizoTrabajo = true;
                    }
                }
            }
        }

        //Una vez recorrido todas las ediciones y su contenido verifico si el autor realizo o no algún trabajo
        if (autorRealizoTrabajo) {
            System.out.println("El autor " + autor + " realizó algún trabajo en la edicion número " + numeroEdicio);
        } else {
            System.out.println("El autor " + autor + " no realizó ningún trabajo en la edicion número " + numeroEdicio);
        }
    }

}
