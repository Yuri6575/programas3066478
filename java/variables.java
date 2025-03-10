import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        // Variables
        int a = 5, b = 2;
        int c;
        
        // Sumar
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de operacion es: +");
        System.out.println("La segunda variable es: " + b);
        c = a + b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de c: " + ((Object)c).getClass().getName()); // Muestra el tipo de la variable

        // Restar
        a = 3;
        b = 4;
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de operacion es: -");
        System.out.println("La segunda variable es: " + b);
        c = a - b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de c: " + ((Object)c).getClass().getName());

        // Multiplicar
        a = 8;
        b = 6;
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de operacion es: *");
        System.out.println("La segunda variable es: " + b);
        c = a * b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de c: " + ((Object)c).getClass().getName());

        // Dividir
        a = 4;
        b = 6;
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de operacion es: /");
        System.out.println("La segunda variable es: " + b);
        c = a / b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de c: " + ((Object)c).getClass().getName());

        // Exponenciación (potencia)
        a = 15;
        b = 3;
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de operacion es: **");
        System.out.println("La segunda variable es: " + b);
        c = 1;
        for (int i = 0; i < b; i++) {
            c *= a;
        }
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de c: " + ((Object)c).getClass().getName());

        // Módulo
        a = 236;
        b = 22;
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de operacion es: %");
        System.out.println("La segunda variable es: " + b);
        c = a % b;
        System.out.println("El resultado es: " + c);
        System.out.println("Tipo de c: " + ((Object)c).getClass().getName());

        // Operaciones con entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor para a: ");
        a = scanner.nextInt();
        System.out.print("Ingrese el valor para b: ");
        b = scanner.nextInt();

        int res;

        res = a + b;
        System.out.println("La suma de los numero
