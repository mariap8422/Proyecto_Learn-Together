import java.util.List;
import java.util.ArrayList;

public class Comentario {
    String texto;
    List<Comentario> respuestas;

    public Comentario(String texto) {
        this.texto = texto;
        this.respuestas = new ArrayList<>();
    }

    public int contarComentarios() {
        int total = 1;
        for (Comentario c : respuestas) {
            total += c.contarComentarios();
        }
        return total;
    }
}