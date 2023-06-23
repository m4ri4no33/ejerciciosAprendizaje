/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package guia_12_manosalaobra_ruido;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_12_manosALaObra_ruido {

    public static void main(String[] args) {

        List<Animal> animales = new ArrayList<>();

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        animales.add(a);
        animales.add(b);
        animales.add(c);

        for (Animal animal : animales) {
            animal.hacerRuido();
            System.out.println("---------------------------");
        }

    }
}
