public class BusquedaService {
    private GestorPublicaciones gestorPub;
    private GestorGrupos gestorGrupos;

    public BusquedaService(GestorPublicaciones gestorPub, GestorGrupos gestorGrupos) {
        this.gestorPub = gestorPub;
        this.gestorGrupos = gestorGrupos;
    }

    public void buscarYMostrar(String termino) {
        System.out.println("Resultados para: " + termino);
        var pubs = gestorPub.buscarPorPalabra(termino);
        for (var p : pubs) {
            System.out.println("- " + p.getTitulo() + " por " + p.getAutor());
        }
    }
}