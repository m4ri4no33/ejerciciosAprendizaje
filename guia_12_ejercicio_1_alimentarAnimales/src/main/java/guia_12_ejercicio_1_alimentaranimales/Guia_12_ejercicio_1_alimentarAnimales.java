/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package guia_12_ejercicio_1_alimentaranimales;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_12_ejercicio_1_alimentarAnimales {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doverman");        
        perro1.alimentarse();

        Animal perro2 = new Perro("Teddy", "Croquetas", 11, "Chihuahua");        
        perro2.alimentarse();

        Animal gato1 = new Gato("Pelusa", "Galletas", 10, "Siames");        
        gato1.alimentarse();

        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Peruano");      
        caballo1.alimentarse();
        
    }
}
