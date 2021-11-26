import java.util.*;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        //Dada una lista que contiene valores de tipo String, 
        //se deberá filtrar todos los valores que NO sean null o vacío ("")
        List<String> palabrasFiltradas = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra != null && !palabra.isEmpty()) {
                palabrasFiltradas.add(palabra);
            }
        }
        System.out.println(palabrasFiltradas);
    }
}
