import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Contador que llega hasta 30
        int contador = 0;
        while (contador < 30) {
            contador++;
            System.out.println("Iteración " + contador);
        }

        // Solicitar  valor mayor a 10
        Scanner scanner = new Scanner(System.in);
        int a;
        while (true) {
            System.out.print("Introduzca un valor mayor a 10: ");
            a = scanner.nextInt();

            if (a > 10) {
                System.out.println("Es correcto");
                break; // Sale del ciclo si la condición se cumple
            } else {
                System.out.println("Es incorrecto, pruebe de nuevo");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}
