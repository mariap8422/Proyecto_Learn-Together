import java.util.ArrayList;

public class GestorGrupos {
    private ArrayList<GrupoEstudio> grupos;

    public GestorGrupos() {
        this.grupos = new ArrayList<>();
    }

    public void crearGrupo(GrupoEstudio g) {
        grupos.add(g);
    }

    public ArrayList<GrupoEstudio> buscarPorMateria(String materia) {
        ArrayList<GrupoEstudio> resultados = new ArrayList<>();
        for (GrupoEstudio g : grupos) {
            if (g.getMateria().equals(materia)) {
                resultados.add(g);
            }
        }
        return resultados;
    }

    public GrupoEstudio buscarPorNombre(String nombre) {
        for (GrupoEstudio g : grupos) {
            if (g.getNombre().equals(nombre)) {
                return g;
            }
        }
        return null;
    }
}