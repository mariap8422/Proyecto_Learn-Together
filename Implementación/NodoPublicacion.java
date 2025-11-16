public class NodoPublicacion {
    Publicacion dato;
    NodoPublicacion siguiente;

    public NodoPublicacion(Publicacion p) {
        this.dato = p;
        this.siguiente = null;
    }
}