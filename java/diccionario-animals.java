import java.util.HashMap;
import java.util.Map;

public class DiccionarioAnimales {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar los animales y sus características
        Map<String, String> animales = new HashMap<>();

        // Agregar elementos al "diccionario" de animales
        animales.put("Perro", "Es un mamífero doméstico, conocido por ser un buen amigo del hombre.");
        animales.put("Gato", "Es un mamífero pequeño, muy popular como mascota en muchas casas.");
        animales.put("Elefante", "Es el animal terrestre más grande, conocido por sus enormes orejas y colmillos.");
        animales.put("Tigre", "Es un gran felino conocido por su fuerza y su hermoso pelaje rayado.");
        animales.put("Delfín", "Es un mamífero marino, conocido por su inteligencia y su capacidad para comunicarse.");
        animales.put("Águila", "Es un ave de presa, conocida por su aguda vista y su vuelo majestuoso.");
        
        // Mostrar información sobre cada animal en el diccionario
        System.out.println("Diccionario de Animales:");
        for (Map.Entry<String, String> entry : animales.entrySet()) {
            System.out.println("Animal: " + entry.getKey());
            System.out.println("Descripción: " + entry.getValue());
            System.out.println();
        }

        // Buscar un animal en el diccionario
        String animalBuscado = "Gato";
        if (animales.containsKey(animalBuscado)) {
            System.out.println("Información sobre el " + animalBuscado + ":");
            System.out.println(animales.get(animalBuscado));
        } else {
            System.out.println("El animal " + animalBuscado + " no se encuentra en el diccionario.");
        }
    }
}
