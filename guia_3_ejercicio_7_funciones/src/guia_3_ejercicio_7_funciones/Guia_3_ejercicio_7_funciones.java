package guia_3_ejercicio_7_funciones;

import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de 
largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera 
incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de 
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá 
investigar cómo se utilizan las siguientes funciones de Java Substring(),
Length(), equals().
@author Mariano Benegas
 */
public class Guia_3_ejercicio_7_funciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int c, in;
        String frase;

        c = 0;
        in = 0;

        System.out.println("Marque &&&&& si desea finalizar");

        do {

            do {
                System.out.println("Ingresar una frase ");
                frase = leer.nextLine();
            } while (frase.length() == 5);

            if (frase.substring(0).equals("X") && frase.substring(4).equals("O")) {
                c = c + 1;
            } else {
                in = in + 1;
            }

        } while (frase.equalsIgnoreCase("&&&&&"));

        System.out.println("La cantidad de lecturas correctas fueron: " + c);
        System.out.println("La cantidad de lecturas incorrectas fueron: " + in);
    }
}


