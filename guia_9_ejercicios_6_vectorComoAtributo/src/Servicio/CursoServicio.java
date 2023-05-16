/*
 Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese
el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el 
objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle
valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana
que se repite el encuentro.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class CursoServicio {

    Scanner leer = new Scanner(System.in);

    public String[] cargarAlumnos() {

        String[] vec = new String[5];
        System.out.println("INGRESE LOS NOMBRES DE ALUMNOS");
        for (int i = 0; i < 5; i++) {
            System.out.println("ALUMNO [" + (i + 1) + "]:");
            vec[i] = leer.nextLine();
        }
        return vec;

    }

    public Curso crearCurso() {
        Curso nuevo = new Curso();

        System.out.println("NOMBRE DE CURSO");
        nuevo.setNombreCurso(leer.next());
        System.out.println("CANTIDAD DE HORAS DIARIAS");
        nuevo.setCantidadHorasPorDia(leer.nextDouble());
        System.out.println("CANTIDAD DIAS POR SEMANA");
        nuevo.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("TURNO - MAÑANA O TARDE");
        nuevo.setTurno(leer.next());
        System.out.println("PRECIO POR HORA");        
        nuevo.setPrecioPorHora(leer.nextDouble());
        leer.nextLine();
        nuevo.setAlumnos(cargarAlumnos());

        return nuevo;
    }

    /*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana
que se repite el encuentro.*/

    public double calcularGananciaSemanal(Curso nuevo) {
        return (nuevo.getCantidadHorasPorDia() * nuevo.getPrecioPorHora()) * 5
                * nuevo.getCantidadDiasPorSemana();

    }
}
