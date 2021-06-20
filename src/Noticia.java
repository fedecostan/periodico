public class Noticia {

    private String autor;
    private String titular;
    private String contenido;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Noticia(String autor, String titular, String contenido) {
        this.autor = autor;
        this.titular = titular;
        this.contenido = contenido;
    }
}
