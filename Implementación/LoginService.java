public class LoginService {
    private GestorUsuarios gestor;

    public LoginService(GestorUsuarios gestor) {
        this.gestor = gestor;
    }

    public boolean iniciarSesion(String email, String pass) {
        Usuario u = gestor.login(email, pass);
        return u != null;
    }
}