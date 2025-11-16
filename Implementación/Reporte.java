public class Reporte {
    private String tipo; 
    private String contenido;
    private String denunciante;

    public Reporte(String tipo, String contenido, String denunciante) {
        this.tipo = tipo;
        this.contenido = contenido;
        this.denunciante = denunciante;
    }

    public String getTipo() { return tipo; }
    public String getContenido() { return contenido; }
    public String getDenunciante() { return denunciante; }
}