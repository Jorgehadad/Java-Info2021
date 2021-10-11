import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        System.out.println("Ingrese la opcion de lo que desea hacer:");
        String entrada1 = br.readLine(); //Se guarda la entrada en una variable
        //Nótese que readLine siempre retorna String y la clase BufferedReader...
        //no tiene un método para leer enteros, así que debemos convertirlo.
        int opcion = Integer.parseInt(entrada1);//Se transforma la entrada anterior en un entero
        switch (opcion) {
        case 1:
            System.out.println("Por favor ingrese su nombre");//Se pide un dato al usuario
            String nombre = br.readLine(); //Se lee el nombre con readLine() que retorna un String con el dato
            System.out.println("HOLA " + nombre);
            break;  //Transfiere el control fuera del switch
        case 2:
            System.out.println("Acá va la 2da opción");
            break; //Transfiere el control fuera del switch
        default:
            System.out.println("No hay coincidencias");
            break; //Transfiere el control fuera del switch
}
    System.out.println("Fin del programa.");
    }
}
