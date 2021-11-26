import java.util.List;
import java.util.stream.Collectors;

public class ejercicio3 {
    public static void main(String[] args) throws Exception {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
//Se dispone de una lista de Strings, de la cual saber la cantidad de 
//valores que comiencen con la letra B (tanto mayúscula como minúscula, 
//en ese caso decimos que será ignoreCase).
        int contador = palabras.stream().filter(p -> p.toLowerCase().startsWith("b")).collect(Collectors.toList()).size();
        System.out.println(contador);

    }
}
