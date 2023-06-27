/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */

package guia_12_ejercicio_4_calculoformas;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_12_ejercicio_4_calculoFormas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        
        System.out.println("INGRESE MEDIDA RADIO");
        Circulo circulo = new Circulo(leer.nextDouble());
        
        System.out.println("INGRESE VALOR DE LADO 1");
        rectangulo.setLado1( leer.nextDouble());
        System.out.println("INGRESE VALOR DE LADO 2");
        rectangulo.setLado2(leer.nextDouble());
        
        System.out.println("---------------------------------------------");
        System.out.println("CALCULO CIRCUNFERENCIA DEL CIRCULO");
        System.out.println(circulo.calculoPerimetro());
        System.out.println("CALCULO SUPERFICIE DEL CIRCULO");
        System.out.println(circulo.calculoSuperficie());
        
        System.out.println("---------------------------------------------");
        System.out.println("CALCULO PERIMETRO DEL RECTANGULO O CUADRADO");
        System.out.println(rectangulo.calculoPerimetro());
        System.out.println("CALCULO SUPERFICIE DEL RECTANGULO O CUADRADO");
        System.out.println(rectangulo.calculoSuperficie());
        
    }
}
