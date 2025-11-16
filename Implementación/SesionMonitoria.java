import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class SesionMonitoria {
    private Usuario monitor;
    private String materia;
    private Date horario;
    private List<Usuario> solicitantes;

    public SesionMonitoria(Usuario monitor, String materia, Date horario) {
        this.monitor = monitor;
        this.materia = materia;
        this.horario = horario;
        this.solicitantes = new ArrayList<>();
    }

    public void agregarSolicitud(Usuario u) { solicitantes.add(u); }
    public Usuario getMonitor() { return monitor; }
    public String getMateria() { return materia; }
    public Date getHorario() { return horario; }
    public List<Usuario> getSolicitantes() { return solicitantes; }
}