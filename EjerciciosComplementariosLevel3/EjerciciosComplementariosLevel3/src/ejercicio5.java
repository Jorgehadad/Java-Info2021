import java.time.LocalDate;
import java.util.*;

public class ejercicio5 {
    public static void main(String[] args) throws Exception {

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)));
        alumnos.add(new Alumno("Marge", "Simpson", LocalDate.now().minusYears(30)));
        alumnos.add(new Alumno("Bart", "Simpson", LocalDate.now().minusYears(30)));
        alumnos.add(new Alumno("Lisa", "Simpson", LocalDate.now().minusYears(30)));
        alumnos.add(new Alumno("Maggie", "Simpson", LocalDate.now().minusYears(30)));
        alumnos.add(new Alumno("Marge", "Simpson", LocalDate.now().minusYears(30)));

//Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre 
//(con separador de espacio en blanco) y el value la edad del alumno.
        Map<String, Integer> edades = new HashMap<>();
        for (Alumno alumno : alumnos) {
            edades.put(alumno.getApellido() + " " + alumno.getNombre(), alumno.getEdad());
        }
        System.out.println(edades);
    }
}
