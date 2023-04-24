
package guia_3_extras_1_tiempo;

import java.util.Scanner;

/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
su equivalente: 1 día, 2 horas.
 * @author Mariano Benegas
 */
public class Guia_3_extras_1_tiempo {

    
    public static void main(String[] args) {
        int minutos;
        float dias;
        float horas;
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese minutos a calcular");
        minutos = Leer.nextInt();
        horas = minutos / 60;
        dias = horas / 24;
        System.out.println("La cantidad ingresada corresponde a "+ horas + " horas y "+ dias + " dias");
        
        
    }
    
}
