/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario 
los dos números y los ingresa en los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia que existe 
entre los dos puntos que existen en la clase Puntos. Para conocer como calcular
la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 */
package guia_7_extras_2;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Puntos {

    public int x1, x2, y1, y2;

    public void crearPuntos() {
        Scanner nuevo = new Scanner(System.in);
        System.out.println("Ingrese valor de x1");
        x1 = nuevo.nextInt();
        System.out.println("Ingrese valor de y1");
        y1 = nuevo.nextInt();
        System.out.println("Ingrese valor de x2");
        x2 = nuevo.nextInt();
        System.out.println("Ingrese valor de y2");
        y2 = nuevo.nextInt();

    }

    public Puntos() {
    }
    

    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distanciaEntrePuntos() {

        double distancia = Math.sqrt(Math.pow((x1 - x2), 2) - Math.pow((y1 - y2), 2));
        return distancia;

    }

}
