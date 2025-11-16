import java.io.*;
import java.util.ArrayList;

public class Persistencia {
    public static void guardarUsuarios(GestorUsuarios gestor, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(gestor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GestorUsuarios cargarUsuarios(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (GestorUsuarios) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new GestorUsuarios();
        }
    }
}