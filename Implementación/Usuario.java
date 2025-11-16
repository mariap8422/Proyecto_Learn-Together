import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String email;
    private String carrera;
    private int semestre;
    private String materia; 
    private List<String> intereses;
    private String fotoRuta;
    private String rol;
    private List<String> actividadReciente;
    private List<GrupoEstudio> grupos;

    public Usuario(String nombre, String email, String carrera, int semestre, String materia) { 
        this.nombre = nombre;
        this.email = email;
        this.carrera = carrera;
        this.semestre = semestre;
        this.materia = materia; 
        this.intereses = new ArrayList<>();
        this.rol = "estudiante";
        this.actividadReciente = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getCarrera() { return carrera; }
    public int getSemestre() { return semestre; }
    public String getMateria() { return materia; } 
    public List<String> getIntereses() { return intereses; }
    public String getFotoRuta() { return fotoRuta; }
    public void setFotoRuta(String fotoRuta) { this.fotoRuta = fotoRuta; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
    public List<String> getActividadReciente() { return actividadReciente; }
    public void agregarActividad(String act) { this.actividadReciente.add(act); }
    public List<GrupoEstudio> getGrupos() { return grupos; }
    public void unirseAGrupo(GrupoEstudio g) { grupos.add(g); }
}