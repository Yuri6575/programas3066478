public class Main {

    public static void saludar() {
        System.out.println("¡Hola, bienvenido al programa!");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static float multiplicar(float x, float y) {
        return x * y;
    }

    public static void main(String[] args) {
        
        saludar();

        
        int resultadoSuma = sumar(5, 3);
        System.out.println("La suma de 5 y 3 es: " + resultadoSuma);

        
        float resultadoMultiplicacion = multiplicar(4.5f, 2.3f);
        System.out.println("El producto de 4.5 y 2.3 es: " + resultadoMultiplicacion);
    }
}
