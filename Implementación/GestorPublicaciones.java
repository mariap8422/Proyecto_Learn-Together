import java.util.ArrayList;

public class GestorPublicaciones {
    private ArrayList<Publicacion> publicaciones;

    public GestorPublicaciones() {
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion p) {
        publicaciones.add(p);
    }

    public ArrayList<Publicacion> buscarPorMateria(String materia) {
        ArrayList<Publicacion> resultados = new ArrayList<>();
        for (Publicacion p : publicaciones) {
            if (p.getContenido().contains(materia) || p.getTitulo().contains(materia)) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    public ArrayList<Publicacion> buscarPorPalabra(String palabra) { 
        ArrayList<Publicacion> resultados = new ArrayList<>();
        for (Publicacion p : publicaciones) {
            if (p.getContenido().toLowerCase().contains(palabra.toLowerCase()) ||
                p.getTitulo().toLowerCase().contains(palabra.toLowerCase())) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    public ArrayList<Publicacion> buscarPorAutor(String autor) {
        ArrayList<Publicacion> resultados = new ArrayList<>();
        for (Publicacion p : publicaciones) {
            if (p.getAutor().equals(autor)) {
                resultados.add(p);
            }
        }
        return resultados;
    }
}