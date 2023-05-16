/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Mes;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/*
 * @author Mariano Benegas
 */
public class MesServicio {

    public Mes crearMes() {

        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int i = (int) (Math.random() * 13);

        String mesSecreto = mes[i];

        return new Mes(mes, mesSecreto);
    }

    public void adivina(Mes mes) {

        Scanner leer = new Scanner(System.in);
        String teclado;
        do {
            System.out.println("ADIVINE EL MES!! INGRESE EN MINUSCULAS");
            teclado = leer.next();
            if (teclado.equals(mes.getMesSecreto())) {
                System.out.println("¡USTED ACERTO! ¡FELICITACIONES!");
                System.out.println("MES SECRETO " + mes.getMesSecreto());
                
            } else {
                System.err.println("NO ACERTO");
                System.out.println("INTENTE NUEVAMENTE");

            }
        } while (teclado != mes.getMesSecreto());
       
    }

}


