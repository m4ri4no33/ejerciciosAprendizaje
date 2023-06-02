/*
 En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. 
Se pide toda la información al usuario y ese Alumno se guarda en una lista de 
tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se 
llama al método. Dentro del método se usará la lista notas para calcular el 
promedio final de alumno. Siendo este promedio final, devuelto por el método y
mostrado en el main.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/*
 * @author Mariano Benegas
 */
public class AlumnoServicio {

    ArrayList<Alumno> listAlumno = new ArrayList<>();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno() {

        String resp = "";
        do {
            System.out.println("INGRESE EL NOMBRE DEL ALUMNO");
            String nombre = leer.next();
            ArrayList<Integer> notas = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                System.out.println("INGRESE LA " + (i + 1) + " NOTA");
                Integer nota = leer.nextInt();
                notas.add(nota);
            }
            Alumno a1 = new Alumno(nombre, notas);
            listAlumno.add(a1);

            System.out.println("DESEA INGRESAR OTRO ALUMNO?? -SI- PARA CONTINUAR");
            resp = leer.next();

        } while (resp.equalsIgnoreCase("SI"));
    }
    
    public void notaFinal(){
        
        Double sumarNota = (double) 0;
        double promedio = 0;
        System.out.println("INGRESE NOMBRE ALUMNO A CALCULAR PROMEDIO");
        String resp = leer.next();
        
        Iterator<Alumno> it = listAlumno.iterator();
        
        while(it.hasNext()){
            Alumno aux = it.next();
            if(aux.getNombre().equals(resp)){
                for (Integer notas : aux.getNota()) {
                    sumarNota += notas;
                }
                promedio = sumarNota/aux.getNota().size();
            }
        }
        
        System.out.println("EL PROMEDIO DE "+ resp + " ES DE: "+ promedio );
    }

}
