import java.util.HashMap;

public class GestorUsuarios {
    private HashMap<String, Usuario> usuarios;

    public GestorUsuarios() {
        this.usuarios = new HashMap<>();
    }

    public boolean registrarUsuario(Usuario u) {
        if (u.getEmail().endsWith("@universidad.edu.co") && !usuarios.containsKey(u.getEmail())) {
            usuarios.put(u.getEmail(), u);
            return true;
        }
        return false;
    }

    public Usuario login(String email, String pass) {
        if (usuarios.containsKey(email)) {
            return usuarios.get(email);
        }
        return null;
    }

    public Usuario buscarUsuario(String email) {
        return usuarios.get(email);
    }
}