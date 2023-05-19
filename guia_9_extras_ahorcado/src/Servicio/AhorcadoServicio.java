/*
 Definir los siguientes
métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada 
letra de la palabra en un índice del vector. Y también, guarda la cantidad de 
jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
si la letra ingresada es parte de la palabra o no. También informará si la letra
estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez 
que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
 */
package Servicio;

import Entidad.Ahorcado;

import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class AhorcadoServicio {

    private Scanner leer = new Scanner(System.in);

    public void crearJuego(Ahorcado vector) {

        System.out.println("INGRESE UNA PALABRA PARA JUGAR");
        String palabra = leer.next();
        int tamaño = palabra.length();
        System.out.println("INGRESE CANTIDAD DE INTENTOS A PROBAR");
        vector.setJugadasMaxima(leer.nextInt());

        String[] vec1 = new String[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vec1[i] = palabra.substring(i, i + 1);
        }
        //for (int i = 0; i < tamaño; i++) {
        //    System.out.print("[" + vec1[i] + "]");
        // }
        //System.out.println("");
        vector.setVec(vec1);

    }

    public int longitud(Ahorcado vector) {

        return vector.getVec().length;
    }

    /*Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
si la letra ingresada es parte de la palabra o no. También informará si la letra
estaba o no.*/
    public void buscar(Ahorcado vector, String letra) {
        String[] vec2 = vector.getVec();
        int cont = 0;

        for (int i = 0; i < vec2.length; i++) {
            if (letra.equals(vec2[i])) {
                cont++;
            }

        }
        if (cont > 0) {
            System.out.println("LA LETRA " + letra + " SE ENCONTRO " + cont);
        } else {
            System.out.println("ESTA PALABRA NO TIENE LETRA " + letra);
        }
        vector.setEncontradas(vector.getEncontradas() + cont);

    }

    /* Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez 
que se busque una letra que no esté, se le restará uno a sus oportunidades.*/
    public boolean encontradas(Ahorcado vector, String letra) {
        System.out.println("LETRAS ENCONTRADAS : " + vector.getEncontradas());
        System.out.println("LE FALTAN : "
                + (vector.getVec().length - vector.getEncontradas()) + " LETRAS");

        String[] vec2 = vector.getVec();
        int cont = 0;

        for (int i = 0; i < vec2.length; i++) {
            if (letra.equals(vec2[i])) {
                cont++;
            }

        }
        if (cont == 0) {
            vector.setJugadasMaxima(vector.getJugadasMaxima() - 1);
        }
        return cont > 0;
    }

    public void intentos(Ahorcado vector) {
        System.out.println("LE QUEDAN " + vector.getJugadasMaxima() + " INTENTOS");

        if (vector.getJugadasMaxima() == 0) {
            System.out.println("NO LE QUEDAN INTENTOS");
            System.out.println("FIN DEL JUEGO");
            System.out.println("USTED PERDIO!!");
        }
    }

    public boolean ganador(Ahorcado vector) {
        if (vector.getEncontradas() == vector.getVec().length) {
            System.out.println("FELICITACIONES USTED GANO!!");

        }
        return vector.getEncontradas() == vector.getVec().length;
    }

    public void juego() {
        Scanner leer = new Scanner(System.in);
        AhorcadoServicio sv = new AhorcadoServicio();
        Ahorcado et = new Ahorcado();
        String letra;

        System.out.println("BIENVENIDO AL JUEGO AHORCADO");
        sv.crearJuego(et);
        do {
            System.out.println("LA PALABRA CONTIENE "
                    + sv.longitud(et) + " CARACTERES");
            System.out.println("INGRESE UNA LETRA A BUSCAR");
            letra = leer.next();
            sv.buscar(et, letra);
            sv.encontradas(et, letra);
            sv.intentos(et);
            //sv.ganador(et);

        } while (et.getJugadasMaxima() > 0 && sv.ganador(et) == false);
    }

}
