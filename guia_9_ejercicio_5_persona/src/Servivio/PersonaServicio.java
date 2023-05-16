/*
 Crear una clase PersonaService, en el paquete servicio, con los 
siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona 
a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de 
fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si 
la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package Servivio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class PersonaServicio {

    public Persona creaPersona() {
        Persona nueva = new Persona();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("INGRESE SU NOMBRE COMPLETO");
        nueva.setNombre(leer.next());
        
        System.out.println("INGRESE SU FECHA DE NACIMIENTO AAAA/MM/DD");        
        Date nacimiento = new Date(leer.nextInt()-1900, leer.nextInt()-1, leer.nextInt());
        
        nueva.setFechaNacimiento(nacimiento);

        return nueva;
    }

    public int calcularEdad(Persona nueva) {
        
        Date actual = new Date();
        Date nacimiento = nueva.getFechaNacimiento();
        int edad = actual.getYear()-nacimiento.getYear();
        //variable calcular edad mas corta con operadores logicos
        if (actual.getMonth() < nacimiento.getMonth() || (actual.getMonth() == nacimiento.getMonth()
                        && actual.getDate() < nacimiento.getDate())) {
            edad--;
        }
        return edad;
        /*if (actual.getMonth() <= nacimiento.getMonth()) {
            if (actual.getMonth() == nacimiento.getMonth()) {
                if (nacimiento.getDate() > actual.getDate()) {
                    edad--;
                }
            } else {
                edad--;       
           }
        } */   

    }
    
    public boolean menorQue(Persona nueva ,int edad){
        
        return calcularEdad(nueva) < edad;
        
    }
    
    public void mostrarPersona(Persona nueva){
        System.out.println("NOMBRE: "+nueva.getNombre());
        System.out.println("FECHA DE NACIMIENTO: "+nueva.getFechaNacimiento());
    }

}
