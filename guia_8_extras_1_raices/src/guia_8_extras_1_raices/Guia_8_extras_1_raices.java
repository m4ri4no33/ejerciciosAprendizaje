/*

 */
package guia_8_extras_1_raices;

import Entidad.Raices;
import Servicio.RaicesServicio;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class Guia_8_extras_1_raices {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RaicesServicio calcular = new RaicesServicio();
        Raices nueva = new Raices();

        System.out.println("Ingrese valor A");
        nueva.setA(leer.nextDouble());
        System.out.println("Ingrese valor B");
        nueva.setB(leer.nextDouble());
        System.out.println("Ingrese valor C");
        nueva.setC(leer.nextDouble());

        System.out.println(calcular.getdiscriminante(nueva));

        calcular.calcular(nueva);

    }

}
