import java.util.Scanner;

public class Consola {
    private Scanner sc;
    private GestorUsuarios usuarios;
    private Usuario actual;

    public Consola() {
        this.sc = new Scanner(System.in);
        this.usuarios = new GestorUsuarios();
    }

    public void iniciar() {
        while (true) {
            System.out.println("\n LearnTogether ");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            int opt = sc.nextInt();
            sc.nextLine();

            if (opt == 1) {
                registrarUsuario();
            } else if (opt == 2) {
                iniciarSesion();
                if (actual != null) menuPrincipal();
            } else if (opt == 3) {
                break;
            }
        }
    }

    private void registrarUsuario() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Email (@universidad.edu.co): ");
        String email = sc.nextLine();
        System.out.print("Carrera: ");
        String carrera = sc.nextLine();
        System.out.print("Semestre: ");
        int semestre = sc.nextInt();
        sc.nextLine();
        System.out.print("Materia: "); 
        String materia = sc.nextLine(); 

        Usuario u = new Usuario(nombre, email, carrera, semestre, materia); 
        if (usuarios.registrarUsuario(u)) {
            System.out.println("Usuario registrado.");
        } else {
            System.out.println("Error al registrar.");
        }
    }

    private void iniciarSesion() {
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Contraseña: ");
        String pass = sc.nextLine();

        LoginService login = new LoginService(usuarios);
        if (login.iniciarSesion(email, pass)) {
            actual = usuarios.buscarUsuario(email);
            System.out.println("Bienvenido, " + actual.getNombre());
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }

    private void menuPrincipal() {
        while (true) {
            System.out.println("\n Menú Principal ");
            System.out.println("1. Ver perfil");
            System.out.println("2. Publicar");
            System.out.println("3. Buscar");
            System.out.println("4. Crear grupo");
            System.out.println("5. Cerrar sesión");
            System.out.print("Elija una opción: ");
            int opt = sc.nextInt();
            sc.nextLine();

            if (opt == 1) {
                System.out.println("Perfil: " + actual.getNombre() + " - " + actual.getCarrera());
            } else if (opt == 2) {
                // publicar
            } else if (opt == 3) {
                // buscar
            } else if (opt == 4) {
                // crear grupo
            } else if (opt == 5) {
                actual = null;
                break;
            }
        }
    }
}