import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


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
            ArrayList<String> testList = new ArrayList<String>();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingresa tus ciudades favoritas");
                testList.add(br.readLine());
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("#"+String.valueOf(i+1) + " " + testList.get(i));
            }
            System.out.println(testList);
            break;

        case 2:
 //Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número 
 //entero al principio de la lista y otro al final. Por último, iterar e 
 //imprimir los elementos de la lista y el tamaño de la misma (antes y 
 //después de agregar a en la primera y última posición).
            ArrayList<Integer> numeros = new ArrayList<>();
            numeros.add(1);
            numeros.add(2);
            numeros.add(3);
            numeros.add(4);
            numeros.add(5);
            int length = numeros.size();
            System.out.println(numeros);
            System.out.println(length);
            numeros.add(0, 0);
            numeros.add(6, 6);
            length = numeros.size();
            System.out.println(numeros);
            System.out.println(length);
            break;

        case 3:
//Crear una lista que contenga como elementos la numeración de cartas de una baraja 
//francesa (solo los valores, no figuras). Se deberá cargar el ArrayList 
//(en orden), imprimir, imprimir en orden inverso (reverse), desordenar 
//(mezclar) el arrayList y volver a imprimir.            
        String palos[] = { "oros", "bastos", "copas", "espadas"};  
        ArrayList <String> barajaInicial= new ArrayList<>();
        String c = "";
        for (int n=1; n<13; n++)
        {
            for (int i=0; i<4; i++){
                c = (String.valueOf(n)+ " " + String.valueOf(palos[i]) );
                barajaInicial.add(c);
                }
        }
        // printing the unsorted ArrayList   
        System.out.println("Before Sorting: "+ barajaInicial);   
        // Sorting ArrayList in ascending Order   
        Collections.sort(barajaInicial);   
        // printing the sorted ArrayList   
        System.out.println("After Sorting: "+ barajaInicial);   
        // Print the reverse sorted ArrayList   
        Collections.sort(barajaInicial, Collections.reverseOrder());   
        System.out.println("After Sorting reverse: "+ barajaInicial); 
        break;
    
        case 4:
//Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
        ArrayList <String> estudiantes= new ArrayList<>();
        estudiantes.add("Juan");estudiantes.add("Juan2");
        estudiantes.add("Juan3");estudiantes.add("Juan4");
        estudiantes.add("Juan5");estudiantes.add("Juan6");
        estudiantes.add("Juan7");estudiantes.add("Juan8");
        estudiantes.add("Juan9");estudiantes.add("Juan10");
        estudiantes.add("Juan11");estudiantes.add("Juan12");

        var split = estudiantes.subList(0, 4);
        var split2 = estudiantes.subList(4, 8);
        var split3 = estudiantes.subList(8, 12);
        System.out.println(split);
        System.out.println(split2);
        System.out.println(split3);
        break;

        case 5:
//Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga
// de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.         


        break;

        case 6:
        Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> diccionario = new HashMap<Integer, Integer>();
        empleados.add(new Empleado(42667658, "Gonzalo Morales", 160, 450));
        empleados.add(new Empleado(34588901, "Carolina Monzón", 130, 445));
        empleados.add(new Empleado(33099901, "Belén Cáceress", 190, 410));
        empleados.add(new Empleado(29004533, "Chiara Barboza", 300, 398));

        for (Empleado i:empleados){
            int sueldo = i.getValorHora() * i.getHorasTrabajadas();
            diccionario.put(i.getDni(), sueldo);
            System.out.println("Empleado: " + i.getNombre() + " - DNI: " + i.getDni() + " - Sueldo: " + sueldo);
        }
        
        break;

        case 7:
//Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. 
//Con la secuencia de números enteros de principio a final. 
//Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y 
//si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
        System.out.println("No hay coincidencias");
        break;

        default:
            System.out.println("No hay coincidencias");
            break; //Transfiere el control fuera del switch
    };
    System.out.println("Fin del programa.");
}

//funciones ------------ no me deja ponerlas en el void pq es un procedimiento y no retorna valores
//en cambio estas funciones si
    public static int factorial(int numero) {
        int fact = 1;
        for( int i = 1; i <= numero; i++ ) {
        fact *= i;
        }
        return fact;
        }

    public static int fizzBuzzFunction(int numero, int numero2) {
        int fact = 1;
        for( int i = 1; i <= numero; i++ ) {
        fact *= i;
        }
        return fact;
    }

    //para ejercicio 6
    static class Empleado{
        private int dni;
        private String nombre;
        private int horasTrabajadas;
        private int valorHora;

        public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora){
            this.dni = dni;
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.valorHora = valorHora;
        }

        public int getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }
        
        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public int getValorHora() {
            return valorHora;
        }
    }

}