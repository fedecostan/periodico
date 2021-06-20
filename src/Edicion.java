import java.util.ArrayList;

public class Edicion {

    //Cada edición incluye noticias, editoriales, viñetas y reportajes.
    private ArrayList<Noticia> noticias;
    private ArrayList<Editorial> editoriales;
    private ArrayList<Vinieta> vinietas;
    private ArrayList<Reportaje> reportajes;
    private ArrayList<Anuncio> anuncios;
    private int numero;
    private String fecha;
    private int paginas;

    public Edicion(ArrayList<Noticia> noticias, ArrayList<Editorial> editoriales,
                   ArrayList<Vinieta> vinietas, ArrayList<Reportaje> reportajes,
                   ArrayList<Anuncio> anuncios, int numero, String fecha, int paginas) {
        this.noticias = noticias;
        this.editoriales = editoriales;
        this.vinietas = vinietas;
        this.reportajes = reportajes;
        this.anuncios = anuncios;
        this.numero = numero;
        this.fecha = fecha;
        this.paginas = paginas;
    }

    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(ArrayList<Noticia> noticias) {
        this.noticias = noticias;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(ArrayList<Editorial> editoriales) {
        this.editoriales = editoriales;
    }

    public ArrayList<Vinieta> getVinietas() {
        return vinietas;
    }

    public void setVinietas(ArrayList<Vinieta> vinietas) {
        this.vinietas = vinietas;
    }

    public ArrayList<Reportaje> getReportajes() {
        return reportajes;
    }

    public void setReportajes(ArrayList<Reportaje> reportajes) {
        this.reportajes = reportajes;
    }

    public ArrayList<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(ArrayList<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
