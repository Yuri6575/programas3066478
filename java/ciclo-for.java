import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer entradas
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int A = scanner.nextInt();

   
        int B = 0;

        
        System.out.print("Ingrese el segundo valor: ");
        int C = scanner.nextInt();

    
        int valor = (int) Math.pow(A, C);  

       
        System.out.println("La potencia de " + A + " sobre " + C + " es: " + valor);

        // Cerrar el scanner
        scanner.close();
    }
}
