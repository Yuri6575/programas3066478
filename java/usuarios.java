import java.util.ArrayList;

class Usuario {
    // Atributos de la clase Usuario
    String nombre;
    int edad;

    // Constructor de la clase Usuario
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles del usuario
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una lista de usuarios
        ArrayList<Usuario> usuarios = new ArrayList<>();

        // Crear 5 usuarios y agregarlos a la lista
        usuarios.add(new Usuario("Ana", 25));
        usuarios.add(new Usuario("Carlos", 30));
        usuarios.add(new Usuario("Marta", 22));
        usuarios.add(new Usuario("Luis", 35));
        usuarios.add(new Usuario("Julia", 28));

        // Mostrar los detalles de los usuarios
        System.out.println("Detalles de los usuarios:");
        for (Usuario usuario : usuarios) {
            usuario.mostrarDetalles();
        }
    }
}
