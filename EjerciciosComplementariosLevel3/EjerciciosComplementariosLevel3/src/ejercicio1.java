import java.util.*;
import java.util.stream.Collectors;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        //Dada una lista que contiene valores de tipo String, se deberá filtrar con STREAM todos los valores que NO sean null o vacío ("")
        //y mostrarlos por pantalla.
        List<String> palabrasResultado = palabras.stream().filter(p -> p != null && !p.isEmpty()).collect(Collectors.toList());
        
        System.out.println(palabrasResultado);
    }
}
