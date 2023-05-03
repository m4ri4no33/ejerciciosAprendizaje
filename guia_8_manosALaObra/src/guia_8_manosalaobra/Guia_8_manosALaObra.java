package guia_8_manosalaobra;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_8_manosALaObra {

    public static void main(String[] args) {

        PersonaService nueva = new PersonaService();

        Persona primera = nueva.creaPersona();

        System.out.println("La nueva persona es " + primera.toString());

    }

}
