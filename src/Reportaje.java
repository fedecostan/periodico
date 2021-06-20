public class Reportaje {

    private String autor;
    private String contenido;
    private String foto;

    public Reportaje(String autor, String contenido, String foto) {
        this.autor = autor;
        this.contenido = contenido;
        this.foto = foto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
