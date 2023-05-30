/*
 La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los nueAlus que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package Servicio;

import Entidad.Estudiante;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class EstudiantesServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearEstudiante(Estudiante[] nueAlu) {

        //Estudiante nueAlu[] = new Estudiante[8];
        double nota;
        for (int i = 0; i < nueAlu.length; i++) {
            nueAlu[i] = new Estudiante();
            System.out.println("INGRESE EL NOMBRE DEL ALUMNO ");
            nueAlu[i].setNombre(leer.next());
            System.out.println("INGRESE EL VALOR DE LA NOTA CORRESPONDIENTE");
            nota = leer.nextDouble();

            do {

                if (nota < 1 || nota > 10) {
                    System.err.println("INGRESE UN VALOR VALIDO ENTRE 1 Y 10");
                    nota = leer.nextDouble();
                }
            } while (nota < 1 || nota > 10);
            nueAlu[i].setNotaFinal(nota);

            //arr[i].setNotaFinal(leer.nextDouble());
            //System.out.println("INGRESE NUEVAMENTE");           
        }

        for (Estudiante nueAlu1 : nueAlu) {
            System.err.println(nueAlu1);
        }

    }

    public void promedio(Estudiante[] nueAlu) {
        double nota = 0;
  
        for (Estudiante nueAlu1 : nueAlu) {
            nota = nota + nueAlu1.getNotaFinal();
        }
        System.out.println("EL PROMEDIO DE LA CLASE ES DE: "+ (nota / nueAlu.length));       

    }

    public String[] mayorPromedio(Estudiante[] nueAlu) {
        double promedio = 0;
        
        
    return String[];
    }
}
