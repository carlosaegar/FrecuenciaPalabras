import java.util.HashMap;
import java.util.Map;

public class FrecuenciaPalabras {
    public static void main(String[] args) {
        String texto = "Hola este es un texto de prueba para ver las palabras que se repiten en " +
                "el texto y las veces que estan en el texto";

        String[] palabras = texto.toLowerCase().split(" ");

        HashMap<String, Integer> frecuencias = new HashMap<>();

        for (String p : palabras) {
            frecuencias.put(p, frecuencias.getOrDefault(p, 0) + 1);
        }

        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : frecuencias.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
