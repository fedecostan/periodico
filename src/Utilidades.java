import java.util.ArrayList;

public class Utilidades {

    public static void mostrarEdicion(Edicion edicion) {
        System.out.println("---");
        System.out.println("Edicion " + edicion.getNumero());
        System.out.println("Fecha: " + edicion.getFecha());
        System.out.println("Paginas: " + edicion.getPaginas());
        System.out.println("--- Noticias ---");
        for (Noticia noticia : edicion.getNoticias()) {
            mostrarNoticia(noticia);
        }
        System.out.println("--- Editoriales ---");
        for (Editorial editorial : edicion.getEditoriales()) {
            mostrarEditorial(editorial);
        }
        System.out.println("--- Viñietas ---");
        for (Vinieta vinieta : edicion.getVinietas()) {
            mostrarVinieta(vinieta);
        }
        System.out.println("--- Reportajes ---");
        for (Reportaje reportaje : edicion.getReportajes()) {
            mostrarReportaje(reportaje);
        }
        System.out.println("--- Anuncios ---");
        for (Anuncio anuncio : edicion.getAnuncios()) {
            mostrarAnuncio(anuncio);
        }
        System.out.println("---");
    }

    public static void mostrarNoticia(Noticia noticia) {
        System.out.print("Autor: " + noticia.getAutor());
        System.out.print(", Titular: " + noticia.getTitular());
        System.out.println(", Contenido: " + noticia.getContenido());
    }

    public static void mostrarEditorial(Editorial editorial) {
        System.out.print("Autor: " + editorial.getAutor());
        System.out.println(", Contenido: " + editorial.getContenido());
    }

    public static void mostrarVinieta(Vinieta vinieta) {
        System.out.print("Autor: " + vinieta.getAutor());
        System.out.println(", CodigoImagen: " + vinieta.getCodigoImagen());
    }

    public static void mostrarReportaje(Reportaje reportaje) {
        System.out.print("Autor: " + reportaje.getAutor());
        System.out.print(", Contenido: " + reportaje.getContenido());
        System.out.println(", Foto: " + reportaje.getFoto());
    }

    public static void mostrarAnuncio(Anuncio anuncio) {
        System.out.print("Nombre: " + anuncio.getNombre());
        System.out.print(", Espacio: " + anuncio.getEspacio());
        System.out.println(", Pagina: " + anuncio.getPagina());
    }

    public static void crearEdiciones() {
        //En este metodo voy a llenar el Array principal de ediciones
        //Para ellos tengo que crear todas las noticias, editoriales, vinietas, etc.
        Noticia noticia1 = new Noticia("Autor1", "Titular1", "Contenido1");
        Noticia noticia2 = new Noticia("Autor2", "Titular2", "Contenido2");
        ArrayList<Noticia> noticias1 = new ArrayList<>();
        noticias1.add(noticia1);
        noticias1.add(noticia2);

        Editorial editorial1 = new Editorial("Autor3", "Contenido3");
        Editorial editorial2 = new Editorial("Autor4", "Contenido4");
        ArrayList<Editorial> editoriales1 = new ArrayList<>();
        editoriales1.add(editorial1);
        editoriales1.add(editorial2);

        Vinieta vinieta1 = new Vinieta("Autor5", "CodigoImagen5");
        Vinieta vinieta2 = new Vinieta("Autor6", "CodigoImagen6");
        ArrayList<Vinieta> vinietas1 = new ArrayList<>();
        vinietas1.add(vinieta1);
        vinietas1.add(vinieta2);

        Reportaje reportaje1 = new Reportaje("Autor3", "Contenido7", "Foto7");
        Reportaje reportaje2 = new Reportaje("Autor8", "Contenido8", "Foto8");
        ArrayList<Reportaje> reportajes1 = new ArrayList<>();
        reportajes1.add(reportaje1);
        reportajes1.add(reportaje2);

        Anuncio anuncio1 = new Anuncio("Nombre9", "Pagina9", "Espacio9");
        Anuncio anuncio2 = new Anuncio("Nombre10", "Pagina10", "Espacio10");
        ArrayList<Anuncio> anuncios1 = new ArrayList<>();
        anuncios1.add(anuncio1);
        anuncios1.add(anuncio2);

        int numero1 = 1;
        String fecha1 = "14-04-2021";
        int paginas1 = 20;

        //Creo un objeto edicion1 con toda la información de la edición 1
        Edicion edicion1 = new Edicion(noticias1,editoriales1,vinietas1,reportajes1,anuncios1,numero1,fecha1,paginas1);

        Noticia noticia3 = new Noticia("Autor11", "Titular11", "Contenido11");
        Noticia noticia4 = new Noticia("Autor12", "Titular12", "Contenido12");
        ArrayList<Noticia> noticias2 = new ArrayList<>();
        noticias2.add(noticia3);
        noticias2.add(noticia4);

        Editorial editorial3 = new Editorial("Autor3", "Contenido13");
        Editorial editorial4 = new Editorial("Autor14", "Contenido14");
        ArrayList<Editorial> editoriales2 = new ArrayList<>();
        editoriales2.add(editorial3);
        editoriales2.add(editorial4);

        Vinieta vinieta3 = new Vinieta("Autor3", "CodigoImagen15");
        Vinieta vinieta4 = new Vinieta("Autor16", "CodigoImagen16");
        ArrayList<Vinieta> vinietas2 = new ArrayList<>();
        vinietas2.add(vinieta3);
        vinietas2.add(vinieta4);

        Reportaje reportaje3 = new Reportaje("Autor17", "Contenido17", "Foto17");
        Reportaje reportaje4 = new Reportaje("Autor18", "Contenido18", "Foto18");
        ArrayList<Reportaje> reportajes2 = new ArrayList<>();
        reportajes2.add(reportaje3);
        reportajes2.add(reportaje4);

        Anuncio anuncio3 = new Anuncio("Nombre19", "Pagina19", "Espacio19");
        Anuncio anuncio4 = new Anuncio("Nombre20", "Pagina20", "Espacio20");
        ArrayList<Anuncio> anuncios2 = new ArrayList<>();
        anuncios2.add(anuncio3);
        anuncios2.add(anuncio4);

        int numero2 = 2;
        String fecha2 = "13-03-2021";
        int paginas2 = 15;

        //Creo un objeto edicion2 con toda la información de la edición 2
        Edicion edicion2 = new Edicion(noticias2,editoriales2,vinietas2,reportajes2,anuncios2,numero2,fecha2,paginas2);

        //Agrego edicion1 y edicion2 a mi array principal de ediciones
        Principal.ediciones.add(edicion1);
        Principal.ediciones.add(edicion2);
    }

}
