/*
 Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package guia_12_ejerciciosextra_edificio;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_12_ejerciciosExtra_edificio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String respuesta;

        ArrayList<Edificio> edificios = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("INGRESE UN EDIFICIO A CARGAR");
            System.out.println("OPCIONES: POLIDEPORTIVO O EDIFICIO");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("polideportivo")) {
                System.out.println("CREAR UN POLIDEPORTIVO");
                Polideportivo polid = new Polideportivo();
                System.out.println("Ingrese el nombre del Polideportivo");
                polid.setNombre(leer.next());
                System.out.println("Ingrese si posee techo true o false");
                polid.setTechado(leer.nextBoolean());
                System.out.println("Ingrese sus medidas ancho/alto/largo");
                polid.setAncho(leer.nextDouble());
                polid.setAlto(leer.nextDouble());
                polid.setLargo(leer.nextDouble());
                edificios.add(polid);
                System.out.println("---------------------------------------------");
            } else if (respuesta.equalsIgnoreCase("edificio")) {
                System.out.println("CREAR UN EDIFICIO");
                EdificioDeOficinas ofice = new EdificioDeOficinas();
                System.out.println("INGRESE LOS DATOS PARA DETERMINAR LA CANTIDAD"
                        + "DE PERSONAS QUE PUEDEN TRABAJAR EN EL EDIFICIO.");
                System.out.println("POR FAVOR INDIQUE LA CANTIDAD DE PISOS QUE "
                        + "POSEE EL EDIFICIO");
                ofice.setNumPisos(leer.nextInt());
                System.out.println("INDIQUE CANTIDAD DE OFICINAS POR PISO");
                ofice.setNumOficinas(leer.nextInt());
                System.out.println("INDIQUE CANTIDAD DE PERSONAL POR OFICINA");
                ofice.setPersonasPorOfic(leer.nextInt());
                System.out.println("Ingrese sus medidas ancho/alto/largo");
                ofice.setAncho(leer.nextDouble());
                ofice.setAlto(leer.nextDouble());
                ofice.setLargo(leer.nextDouble());
                edificios.add(ofice);
                System.out.println("---------------------------------------------");
            }
        }

        //edificios.add(new Polideportivo("MARIO KEMPES", true, 30d, 15d, 60d));
        //edificios.add(new Polideportivo("DIEGO MARADONA", false, 35d, 20d, 75d));
        //edificios.add(new EdificioDeOficinas(0, 0, 0, 10d, 20d, 10d));
        //edificios.add(new EdificioDeOficinas(0, 0, 0, 10d, 40d, 10d));
        for (Edificio edificio : edificios) {
            System.out.println(edificio);
            System.out.println("La superficie del edificio es: "
                    + edificio.calcularSuperficie() + " m2.");
            System.out.println("El volumen del edificio es de: "
                    + edificio.calcularVolumen() + " m3.");
            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                System.out.println("Posee techado: " + poli.isTechado());
            }
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas eOfice = (EdificioDeOficinas) edificio;
                eOfice.cantidadPersonas();

            }

        }
    }
}
