/*
 A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Lavadora extends Electrodomestico {
    //ATRIBUTOS

    private int carga;

    //constructor
    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    /*• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/
    public void crearLavadora(Lavadora nueva) {

        Scanner leer = new Scanner(System.in);
        
        nueva.crearElectrodomestico(nueva);
        
        System.out.println("INGRESE LA CAPACIDAD DE CARGA EN KILOGRAMOS");
        nueva.setCarga(leer.nextInt());
        nueva.precioFinal(nueva);

        
    }

    /*• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
    public void precioFinal(Lavadora artefacto) {
        //super.precioFinal(artefacto);
        if (artefacto.getCarga() > 30) {
            artefacto.setPrecio(artefacto.getPrecio() + 500);
        }

    }

    @Override
    public String toString() {
        return "Lavadora " + "\n carga: " + carga + " Kg" + super.toString();
    }

   
    
    

}
