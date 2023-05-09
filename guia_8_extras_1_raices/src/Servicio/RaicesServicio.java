/*
Luego, en RaicesServicio las operaciones que se podrán 
realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaices() y si devolvió́ true, imprime las 
2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única 
raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará
por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo 
delante de -b
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class RaicesServicio {

    private final Scanner leer = new Scanner(System.in);

    //Método getDiscriminante(): devuelve el valor del discriminante (double). El 
    //discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getdiscriminante(Raices nueva) {

        return (Math.pow(nueva.getB(), 2)) - (4 * nueva.getA() * nueva.getC());

    }

    //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    //que esto ocurra, el discriminante debe ser mayor o igual que 0.
    private boolean tieneRaices(Raices nueva) {
        return getdiscriminante(nueva) > 0;

    }

    //Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
    //para que esto ocurra, el discriminante debe ser igual que 0.
    private boolean tieneRaiz(Raices nueva) {
        return getdiscriminante(nueva) == 0;
    }

    //Método obtenerRaices(): llama a tieneRaices() y si devolvió́ true, imprime las 
    //2 posibles soluciones.(-b±√((b^2)-(4*a*c)))/(2*a) 
    // El error era que debia resolver primero la suma de -B con la raiz del discriminante
    // y por ultima realizar la divicion.
    public void obtenerRaices(Raices nueva) {
        //double raiz = Math.sqrt(getdiscriminante(nueva));
        double x1 = (-(nueva.getB()) + (Math.sqrt(getdiscriminante(nueva)))) / (2 * nueva.getA());
        double x2 = (-(nueva.getB()) - (Math.sqrt(getdiscriminante(nueva)))) / (2 * nueva.getA());
        System.out.println("Solucion X1: " + x1);
        System.out.println("Solucion X2: " + x2);

    }

    //Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única 
    //raíz. Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raices nueva) {

        double x = (-nueva.getB()) / (2 * nueva.getA());
        System.out.println("Unica Raiz: " + x);

    }

    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará
      por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
      obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
      de no existir solución, se mostrará un mensaje.*/
    public void calcular(Raices nueva) {
        if (tieneRaices(nueva)) {
            obtenerRaices(nueva);
        } else if (tieneRaiz(nueva)) {
            obtenerRaiz(nueva);
        } else {
            System.out.println("No tiene soluciones");
        }
    }

}
