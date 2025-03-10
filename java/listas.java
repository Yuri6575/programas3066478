import java.util.ArrayList;

public class MesesDelAño {
    public static void main(String[] args) {
        // Crear una lista para almacenar los meses del año
        ArrayList<String> meses = new ArrayList<>();

        // Agregar los meses del año a la lista
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");

        // Imprimir los meses del año
        System.out.println("Los meses del año son:");
        for (String mes : meses) {
            System.out.println(mes);
        }
    }
}
