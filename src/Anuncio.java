public class Anuncio {

    private String nombre;
    private String pagina;
    private String espacio;

    public Anuncio(String nombre, String pagina, String espacio) {
        this.nombre = nombre;
        this.pagina = pagina;
        this.espacio = espacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }
}
