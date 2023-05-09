/*
 En NIFService se dispondrá de los
siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que
le corresponderá. Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la 
letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método
que funciona de la siguiente manera: Para calcular la letra se toma el resto de
dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22).
El método debe buscar en un array (vector) de caracteres la posición que 
corresponda al resto de la división para obtener la letra correspondiente.
La tabla de caracteres es la siguiente:
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class NIFServicio {
    
    NIF nif = new NIF();

    public NIF crearNif(String[] vector) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero de DNI valido");
        nif.setDNI(sc.nextLong());

        int digito = (int) (nif.getDNI() % 23);

        if (digito >= 0 && digito <= 22) {
            System.out.println(digito);
            nif.setLetra(vector[digito]);
        }

        return nif;
    }

    public void mostrar() {
        System.out.println(nif.getDNI() + " - " + nif.getLetra());
    }

}
