import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class GrupoEstudio {
    private String nombre;
    private String materia;
    private String descripcion;
    private Usuario creador;
    private List<Usuario> miembros;
    private Queue<Mensaje> chat;

    public GrupoEstudio(String nombre, String materia, String descripcion, Usuario creador) {
        this.nombre = nombre;
        this.materia = materia;
        this.descripcion = descripcion;
        this.creador = creador;
        this.miembros = new ArrayList<>();
        this.chat = new LinkedList<>();
        this.miembros.add(creador);
    }

    public void agregarMiembro(Usuario u) { miembros.add(u); }
    public void enviarMensaje(Mensaje m) { chat.add(m); }
    public Queue<Mensaje> getChat() { return chat; }

    public String getNombre() { return nombre; } 
    public String getMateria() { return materia; } 
    public List<Usuario> getMiembros() { return miembros; }
}