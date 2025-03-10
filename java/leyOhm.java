import java.util.Scanner;

public class LeyDeOhm {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Variables
        int v, r;
        float res;

        // Solicitar al usuario el valor del voltaje y la resistencia
        System.out.print("Ingrese el valor del voltaje del circuito (V): ");
        v = scanner.nextInt();

        System.out.print("Ingrese el valor de la resistencia del circuito (R): ");
        r = scanner.nextInt();

        // Calcular la corriente (ley de Ohm: I = V / R)
        if (r != 0) {
            res = (float) v / r;
            System.out.println("Al conectar un resistor de R = " + r + " ohm a una fuente de V = " + v +
                               " voltios, circulará una corriente de " + res + " amperios.");
        } else {
            System.out.println("Error: La resistencia no puede ser cero.");
        }

        scanner.close();
    }
}
