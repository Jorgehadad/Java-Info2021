import java.util.List;
import java.util.stream.*;


public class ejercicio4 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);

        //Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando 
        //la operación de FACTORIAL pero no se desean valores repetidos.
        
        List<Integer> resultado = numeros.stream()
            .distinct()
            .map(n -> factorial(n))
            .collect(Collectors.toList());

        //stream de una lista de integer aplicando el filtro foreach para mostrar el resultado
        resultado.stream().distinct().forEach(System.out::println);

        System.out.println(resultado);
    }

    private static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
