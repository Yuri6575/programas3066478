import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar las dimensiones del rectángulo
        System.out.print("Ingrese la base del rectángulo: ");
        float base = scanner.nextFloat();

        System.out.print("Ingrese la altura del rectángulo: ");
        float altura = scanner.nextFloat();

        
        if (base <= 0 || altura <= 0) {
            System.out.println("Las dimensiones no son válidas. La base y la altura deben ser mayores que 0.");
        } else {
            // Verificar si el rectángulo es un cuadrado
            if (base == altura) {
                System.out.println("Este rectángulo es un cuadrado.");
            } else {
                System.out.println("Este es un rectángulo.");
            }

            // Calcular el área y el perímetro
            float area = base * altura;
            float perimetro = 2 * (base + altura);

            
            System.out.println("Área del rectángulo: " + area);
            System.out.println("Perímetro del rectángulo: " + perimetro);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
