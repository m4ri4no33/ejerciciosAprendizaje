/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Entidades.Amarre;
import Entidades.Barco;
import java.text.DateFormat;
import java.time.Clock;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Herna
 */
public class AmarreDeBarcosMain {

    public static void main(String[] args) {
        Amarre amarre1 = new Amarre("Minimi", Long.MIN_VALUE, Date.from(Instant.now()), Date.from(Instant.now(Clock.systemDefaultZone())), Integer.MIN_VALUE, new Barco(321231231, 321321d, 2003));
        System.out.println(amarre1);
        System.out.println(amarre1.getBarco().calculaAlquiler());
    }
}
