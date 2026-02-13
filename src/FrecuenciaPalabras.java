import java.util.HashMap;
import java.util.Map;

public class FrecuenciaPalabras {
    public static void main(String[] args) {
        String texto = "Hola este es un texto de prueba para ver las palabras que se repiten en " +
                "el texto y las veces que estan en el texto";

        String[] palabras = texto.toLowerCase().split("\\s+");

        // 2. Crear el mapa de frecuencias
        HashMap<String, Integer> frecuencias = new HashMap<>();

        for (String p : palabras) {
            // Si existe suma 1, si no, empieza en 1
            frecuencias.put(p, frecuencias.getOrDefault(p, 0) + 1);
        }

        // 3. Mostrar resultados
        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : frecuencias.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
