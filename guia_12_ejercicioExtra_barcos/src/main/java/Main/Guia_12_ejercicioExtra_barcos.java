/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package Main;

import Entidades.Amarre;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Puerto;
import Entidades.Velero;
import Entidades.Yates;
import java.time.Clock;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_12_ejercicioExtra_barcos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Puerto nuevo = new Puerto();
        Amarre amarre = new Amarre();
        Barco barco = new Barco(254, 155d, 2010);
        BarcoMotor barcoMotor = new BarcoMotor(300, 32523, 200d, 2009);
        Velero velero = new Velero(5, 4589, 180d, 2020);
        Yates yate = new Yates(20, 300, 2458, 220d, 2017);
        
        System.out.println("PARA ALQUILAR UNA UNIDAD DEBE INGRESAR LOS SIG DATOS");
        System.out.println("INGRESE NOMBRE COMPLETO");
        amarre.setNombre(leer.next());
        System.out.println("INGRESE SU D.N.I.");
        amarre.setDni(leer.nextLong());
        System.out.println("INGRESE DESDE QUE FECHA DESEA ALQUILAR");
        amarre.setFechaAlquiler(fechaAlquiler);

        /* Amarre amarre1 = new Amarre("Minimi", 29058334L,
                Date.from(Instant.now()),
                Date.from(Instant.now(Clock.systemDefaultZone())),
                Integer.MIN_VALUE,
                new Barco(321231231, 250d, 2003));
        System.out.println(amarre1);
        System.out.println(amarre1.getBarco().calculaAlquiler());*/
    }
}
