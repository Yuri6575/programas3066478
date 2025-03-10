import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        // Solicitar la temperatura 
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        float temperatura = scanner.nextFloat();

        // Verificar la temperatura y dar una recomendación de vestimenta
        if (temperatura >= 25) {
            System.out.println("Hace calor. Usa ropa ligera como camiseta y shorts.");
        } else if (temperatura >= 22) {
            System.out.println("Hace un clima agradable. Usa ropa cómoda como una camiseta y pantalones.");
        } else if (temperatura >= 20) {
            System.out.println("Hace fresco. Es recomendable usar una chaqueta o suéter.");
        } else if (temperatura >= 17) {
            System.out.println("Hace frío. Usa un abrigo grueso y guantes.");
        } else {
            System.out.println("Hace mucho frío. Usa ropa de invierno como abrigo, bufanda, guantes y gorro.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
