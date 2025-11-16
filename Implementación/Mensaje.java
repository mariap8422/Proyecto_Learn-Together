import java.util.Date;

public class Mensaje {
    private String emisor;
    private String contenido;
    private Date fecha;

    public Mensaje(String emisor, String contenido) {
        this.emisor = emisor;
        this.contenido = contenido;
        this.fecha = new Date();
    }

    public String getEmisor() { return emisor; }
    public String getContenido() { return contenido; }
    public Date getFecha() { return fecha; }
}