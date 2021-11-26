import java.util.*;
import java.util.stream.Collectors;

public class ejercicio2 {
    public static void main(String[] args) throws Exception {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        //Dada una lista que contiene números enteros, se deberá generar otra lista que contendrá el resultado de aplicar la operación de potencia a 2.
        //Por ejemplo, si la lista original contiene los números 1, 2, 3, 4, 5, se deberá generar la lista que contiene los números 1, 4, 9, 16, 25.

        List<Integer> resultado = palabras.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
