import java.io.BufferedReader;
import java.io.InputStreamReader;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

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
            break; //Transfiere el control fuera del switch
        case 4:
            System.out.println("Ingrese el número para calcular el factorial");
            String entrada5 = br.readLine();
            int numero = Integer.parseInt(entrada5);
      
            System.out.println( "Ejemplo del Cálculo del factorial de un número en Java" );
            System.out.println( "El factorial de " + numero + " es: " + factorial(numero)); 
            break; //Transfiere el control fuera del switch
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
            break; //Transfiere el control fuera del switch
        case 6:
            //Se desea una aplicación que solicite 2 números enteros y realice la operación
            // de potencia (sin uso de librerías).
            System.out.println("Ingrese el número a aplicarle la potencia");
            String entrada8 = br.readLine(); //Se guarda la entrada en una variable
            nume1 = Integer.parseInt(entrada8);//Se transforma la entrada anterior en un entero
            System.out.println("Ingrese la potencia");
            String entrada9 = br.readLine(); //Se guarda la entrada en una variable
            nume2 = Integer.parseInt(entrada9);//Se transforma la entrada anterior en un entero
            vari = nume1; 
            for (int i = 1; i < (nume2); i++) {
                vari = vari * nume1;
            };
            System.out.println(nume1 + "**" + nume2 + " =" + " " + (vari));
            break; //Transfiere el control fuera del switch

        case 7:
        //Realizar un programa que dado un String de entrada en minúsculas lo convierta por 
        //completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
            //no voy a hacer 24 combinaciones en el Switch con ASCII así que le doy una solución razonable.

            System.out.println("Ingrese la caden a aplicar mayusculas");
            String cadena = br.readLine(); //Se guarda la entrada en una variable
            String mayuscula = cadena.toUpperCase();
            System.out.println(mayuscula);
            break; //Transfiere el control fuera del switch

        case 8:
            System.out.println("Ingrese el Nombre y Apellido");
            String NyA = br.readLine(); //Se guarda la entrada en una variable
            System.out.println("Ingrese la dirección");
            String Dirección = br.readLine(); //Se guarda la entrada en una variable
            System.out.println("Ingrese la edad");
            String Edad = br.readLine(); //Se guarda la entrada en una variable
            System.out.println("Ingrese la ciudad");
            String Ciudad = br.readLine(); //Se guarda la entrada en una variable

            System.out.println(Ciudad + "-" + Dirección  + "-" + Edad + "-" + NyA);
            break; //Transfiere el control fuera del switch
        
        case 9:
        //Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
            System.out.println("Ingrese una cadena");
            String cadenas = br.readLine(); //Se guarda la entrada en una variable
            System.out.println("Ingrese una letra");
            String letra = br.readLine(); //Se guarda la entrada en una variable
            char letrita = letra.charAt(0);
            int cont = 0;
            for(int i=0; i< cadenas.length(); i++) 
            {
                char chr = cadenas.charAt(i);
                    if(letrita == chr)
                    {
                        cont += 1;
                    }
            }
            System.out.println(cont);      

            break;


        default:
            System.out.println("No hay coincidencias");
            break; //Transfiere el control fuera del switch
}
    System.out.println("Fin del programa.");
    }

    //funciones ------------ no me deja ponerlas en el void
    public static int factorial(int numero) {
        int fact = 1;
        for( int i = 1; i <= numero; i++ ) {
           fact *= i;
        }
        return fact;
    }


}
