/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication75;

import java.util.Calendar;
import sun.util.calendar.CalendarDate;

/**
 *
 * @author Mariano Benegas
 */
public class JavaApplication75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();

        c1.add(Calendar.DATE, 5); /* Añadir 13 meses */

        System.out.println("Fecha 13 meses más: "+c1.getTime().toLocaleString()); /*ahora sí es correcto*/
        
        System.out.println(java.time.LocalDateTime.now().plusDays(5));
    }

}
