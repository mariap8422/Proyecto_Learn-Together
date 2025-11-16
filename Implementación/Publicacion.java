import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Publicacion {
    private String titulo;
    private String contenido;
    private String autor;
    private String categoria;
    private Date fecha;
    private List<Comentario> comentarios;
    private boolean reportado;

    public Publicacion(String titulo, String contenido, String autor, String categoria) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.categoria = categoria;
        this.fecha = new Date();
        this.comentarios = new ArrayList<>();
        this.reportado = false;
    }

    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; } 
    public String getAutor() { return autor; } 
    public String getCategoria() { return categoria; }
    public Date getFecha() { return fecha; }
    public List<Comentario> getComentarios() { return comentarios; }
    public void agregarComentario(Comentario c) { comentarios.add(c); }
    public boolean isReportado() { return reportado; }
    public void reportar() { this.reportado = true; }
}