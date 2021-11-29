import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ejercicio5 {
    public static void main(String[] args) throws Exception {

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Homero", "Simpson", LocalDate.parse("2017-03-10").minusYears(30)));
        alumnos.add(new Alumno("Marge", "Simpson", LocalDate.parse("2017-03-10").minusYears(30)));
        alumnos.add(new Alumno("Bart", "Simpson", LocalDate.parse("2017-03-10").minusYears(30)));
        alumnos.add(new Alumno("Lisa", "Simpson", LocalDate.parse("2017-03-10").minusYears(30)));
        alumnos.add(new Alumno("Maggie", "Simpson", LocalDate.parse("2017-03-10").minusYears(30)));


//Se desea generar con STREAM y con Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre (con separador de espacio en blanco) y el value la edad del alumno.
        Map<String, Integer> edades = alumnos.stream()
                .collect(Collectors.toMap(a -> a.getApellido() + " " + a.getNombre(), a -> a.getEdad()));
        System.out.println(edades);
    }

}
