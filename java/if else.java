public class Main {
    public static void main(String[] args) {
        // Variables
        int a = 2;
        String nombre = "ana";
        int edad = 28;
        String ciudad = "Medellin";

        // Primeras condiciones
        if (a == 2) {
            System.out.println("a vale 2");
        } else {
            System.out.println("a es diferente de 2");
        }

        // Condiciones (nombre y edad)
        if (nombre.equals("ana") && edad == 28) {
            System.out.println("su nombre es ana y tiene 28 años");
        } else if (nombre.equals("ana") && !(edad == 28)) {
            System.out.println("su nombre es ana y no tiene 28 años");
        } else if (!nombre.equals("ana") && edad == 28) {
            System.out.println("su nombre no es ana y tiene 28 años");
        }

        // Condiciones (nombre y ciudad)
        if (nombre.equals("ana") && ciudad.equals("Medellin")) {
            System.out.println("su nombre es ana y la ciudad donde vive es Medellin");
        } else if (nombre.equals("ana") && !ciudad.equals("Medellin")) {
            System.out.println("su nombre es ana y la ciudad donde vive no es Medellin");
        } else if (!nombre.equals("ana") && !ciudad.equals("Medellin")) {
            System.out.println("su nombre no es ana y la ciudad donde vive no es Medellin");
        } else {
            System.out.println("No se llama ana ni tiene 28 años");
        }
    }
}
