import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nombre;
    int pin;
    double saldo;

    public Usuario(String nombre, int pin, double saldo) {
        this.nombre = nombre;
        this.pin = pin;
        this.saldo = saldo;
    }
}

class Banco {
    ArrayList<Usuario> usuarios;

    public Banco(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public boolean autenticar(String nombre, int pin) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombre.equals(nombre)) {
                if (usuario.pin == pin) {
                    System.out.println("Estas logueado");
                    return true;
                } else {
                    System.out.println("Pin Incorrecto");
                    return false;
                }
            }
        }
        System.out.println("El usuario no existe");
        return false;
    }

    public void sacarDinero(String nombre, double monto) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombre.equals(nombre)) {
                if (usuario.saldo < monto) {
                    System.out.println("Saldo insuficiente");
                    return;
                } else {
                    usuario.saldo -= monto;
                    System.out.println("Saldo disponible es: " + usuario.saldo);
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario ana = new Usuario("Ana", 9872, 450);
        Usuario pablo = new Usuario("Pablo", 5555, 200);
        Usuario rodrigo = new Usuario("Rodrigo", 2222, 900);

        // Crear una lista de usuarios y banco
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(ana);
        usuarios.add(pablo);
        usuarios.add(rodrigo);

        Banco banco = new Banco(usuarios);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al banco. Por favor, identifíquese.");
            System.out.print("Introduzca su nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Introduzca el pin: ");
            int pin = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            if (banco.autenticar(nombre, pin)) {
                while (true) {
                    System.out.println("Por favor, elija una opción:\n1. Sacar dinero\n2. Terminar sesión");
                    String opcion = scanner.nextLine();

                    if (opcion.equals("1")) {
                        System.out.print("Introduzca la cantidad a sacar: ");
                        double saldo = scanner.nextDouble();
                        scanner.nextLine(); // Limpiar buffer
                        banco.sacarDinero(nombre, saldo);

                    } else if (opcion.equals("2")) {
                        System.out.println("Saliendo del sistema");
                        break;

                    } else {
                        System.out.println("Opción incorrecta. Por favor, introduzca otra opción");
                    }
                }
            } else {
                System.out.println("Usuario no autenticado, por favor, introduzca un nombre y pin correctos.");
            }
        }
    }
}
