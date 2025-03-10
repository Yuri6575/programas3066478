public class Figura {
    // Atributos de la clase
    private int numLados;
    private int longitud;

    // Constructor de la clase Figura
    public Figura(int numLados, int longitud) {
        this.numLados = numLados;
        this.longitud = longitud;
    }

    // Método para calcular el perímetro
    public int hallarPerimetro() {
        return numLados * longitud;
    }

    public static void main(String[] args) {
        // Crear un objeto Figura, por ejemplo una pirámide con 4 lados y longitud 8
        Figura piramide = new Figura(4, 8);

        // Calcular el perímetro de la pirámide
        int res = piramide.hallarPerimetro();

        // Mostrar el resultado
        System.out.println("El perímetro de la figura es: " + res);
    }
}
