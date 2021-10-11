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
            System.out.println("Ingrese el primer número");
            String entrada2 = br.readLine(); //Se guarda la entrada en una variable
            int num1 = Integer.parseInt(entrada2);//Se transforma la entrada anterior en un entero
            System.out.println("Ingrese el segundo número");
            String entrada3 = br.readLine(); //Se guarda la entrada en una variable
            int num2 = Integer.parseInt(entrada3);//Se transforma la entrada anterior en un entero
            System.out.println(num1 + "+" + num2 + "=" + " " + (num1 + num2));
            System.out.println(num1 + "-" + num2 + "=" + " " + (num1 - num2));
            System.out.println(num1 + "*" + num2 + "=" + " " + (num1 * num2));
            System.out.println(num1 + "/" + num2 + "=" + " " + (num1 / num2));
            System.out.println(num1 + "%" + num2 + "=" + " " + (num1 % num2));
            break; //Transfiere el control fuera del switch
        case 3:
            System.out.println("Ingrese el número de la secuencia");
            String entrada4 = br.readLine(); //Se guarda la entrada en una variable
            int num3 = Integer.parseInt(entrada4);//Se transforma la entrada anterior en un entero
            String var = "";
            for (int i = 1; i < (num3 + 1); i++) {
                var = var + " " + String.valueOf( i);
                System.out.println(var);
            };
        case 4:
            System.out.println("Ingrese el número para calcular el factorial");
            String entrada5 = br.readLine();
            int numero = Integer.parseInt(entrada5);
      
            System.out.println( "Ejemplo del Cálculo del factorial de un número en Java" );
            System.out.println( "El factorial de " + numero + " es: " + factorial(numero)); 

        case 5:
        //Se desea una aplicación que solicite 2 números enteros
        // y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
        System.out.println("Ingrese el primer número");
        String entrada6 = br.readLine(); //Se guarda la entrada en una variable
        int nume1 = Integer.parseInt(entrada6);//Se transforma la entrada anterior en un entero
        System.out.println("Ingrese el segundo número");
        String entrada7 = br.readLine(); //Se guarda la entrada en una variable
        int nume2 = Integer.parseInt(entrada7);//Se transforma la entrada anterior en un entero
        int vari = nume1; 
        for (int i = 1; i < (nume2); i++) {
            vari = vari + nume1;
        };
        System.out.println(nume1 + "*" + nume2 + " =" + " " + (vari));


        default:
            System.out.println("No hay coincidencias");
            break; //Transfiere el control fuera del switch
}
    System.out.println("Fin del programa.");
    }

    //funciones ------------ no me deja ponerlas en el void
    public static int factorial( int numero ) {
        int fact = 1;
        for( int i = 1; i <= numero; i++ ) {
           fact *= i;
        }
        return fact;
    }


}
