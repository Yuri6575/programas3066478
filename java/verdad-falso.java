public class OperacionesBooleanas {
    public static void main(String[] args) {
        // Valores booleanos
        boolean a = true;
        boolean b = false;

        // Operación AND (&&)
        System.out.println(a && b);

        int x = 2;
        int y = 3;
        int c = 4;
        int d = 10;

        // Operación AND con más condiciones
        System.out.println((x == y && c < d));

        // Operación NOT con AND
        System.out.println(!(x == y) && c > d);
    }
}
