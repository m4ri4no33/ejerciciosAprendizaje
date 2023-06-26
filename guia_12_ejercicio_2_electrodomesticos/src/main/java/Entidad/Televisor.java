/*
 Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Televisor extends Electrodomestico {

    //ATRIBUTOS
    private int tamano;
    private boolean sintonia;

    //CONSTRUCTORES
    public Televisor() {
    }

    public Televisor(int tamano, boolean sintonia, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.tamano = tamano;
        this.sintonia = sintonia;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public boolean isSintonia() {
        return sintonia;
    }

    public void setSintonia(boolean sintonia) {
        this.sintonia = sintonia;
    }

    /*• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.*/
    public void crearTelevisor(Televisor nuevo) {

        Scanner leer = new Scanner(System.in);
        nuevo.crearElectrodomestico(nuevo);
        System.out.println("INGRESE EL TAMAÑO DE PANTALLA EN PULGADAS");
        nuevo.setTamano(leer.nextInt());
        System.out.println("EL TELEVISOR POSEE SINTONIZADOR TRUE O FALSE");
        nuevo.setSintonia(leer.nextBoolean());
        
        nuevo.precioFinal(nuevo);

    }

    /*• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
     */
    public void precioFinal(Televisor artefacto) {
        //super.precioFinal(artefacto);
        if (artefacto.getTamano() > 40) {
            artefacto.setPrecio(artefacto.getPrecio() * 1.30);
        }
        if (artefacto.isSintonia()) {
            artefacto.setPrecio(artefacto.getPrecio() + 500);
        }

    }

    @Override
    public String toString() {
        return  "Televisor " + " \n tamaño: " + tamano + " pulgadas , sintonizador: " + sintonia + super.toString();
    }
    
    
}
