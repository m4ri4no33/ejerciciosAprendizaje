/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

13

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

CUADRO
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Electrodomestico {

    //ATRIBUTOS
    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    //CONSTRUCTORES
    public Electrodomestico() {
    }
    
    public Electrodomestico(double precio,String color, char consumo, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }
    // GET Y SETTER

    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public char getConsumo() {
        return consumo;
    }
    
    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /* Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    public char comprobarConsumoEnergetico(char energia) {
        
        if ((energia >= 'A' && energia <= 'F') || (energia >= 'a' && energia <= 'f')) {
            
        } else {
            energia = 'F';
        }
        return energia;
        
    }

    /*• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    public String comprobarColor(String color1) {
        int cont = 0;
        
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        
        for (String colore : colores) {
            if (colore.equalsIgnoreCase(color1)) {
                cont++;
            }
        }
        
        if (cont > 0) {
            color1 = "blanco";
        }
        
        return color1;
    }

    /*• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public void crearElectrodomestico(Electrodomestico nuevo) {
        
        Scanner leer = new Scanner(System.in);
        String cl;
        Character aux;
        System.out.println("INGRESE COLOR DEL PRODUCTO");
        System.out.println("DISPONIBLES BLANCO/ NEGRO/ ROJO/ AZUL/ GRIS");
        cl = nuevo.comprobarColor(leer.next());
        nuevo.setColor(cl);        
        System.out.println("INGRESE CONSUMO DEL ARTEFACTO OPCION DE A HASTA F");
        aux = nuevo.comprobarConsumoEnergetico(leer.next().charAt(0));
        nuevo.setConsumo(aux);
        System.out.println("INGRESE EL PESO EN KILOGRAMOS");
        nuevo.setPeso(leer.nextDouble());
        System.out.println("EL VALOR BASE DE REFERENCIA ES DE $1000");
        nuevo.setPrecio(1000.00);
        nuevo.precioFinal(nuevo);
        
        
    }

    /*• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
    LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000 */
    public void precioFinal(Electrodomestico artefacto) {
        
        char op = Character.toLowerCase(artefacto.getConsumo());
        switch (op) {
            case 'a':
                artefacto.setPrecio(artefacto.getPrecio() + 1000);
                break;
            case 'b':
                artefacto.setPrecio(artefacto.getPrecio() + 800);
                break;
            case 'c':
                artefacto.setPrecio(artefacto.getPrecio() + 600);
                break;
            case 'd':
                artefacto.setPrecio(artefacto.getPrecio() + 500);
                break;
            case 'e':
                artefacto.setPrecio(artefacto.getPrecio() + 300);
                break;
            case 'f':
                artefacto.setPrecio(artefacto.getPrecio() + 100);
                break;
            default:
                System.out.println("VERIFIQUE CLASIFICACION ENERGETICA");
            
        }
        if (artefacto.getPeso() >= 1 && artefacto.getPeso() <= 19) {
            artefacto.setPrecio(artefacto.getPrecio() + 100);
        } else if (artefacto.getPeso() >= 20 && artefacto.getPeso() <= 49) {
            artefacto.setPrecio(artefacto.getPrecio() + 500);
        } else if (artefacto.getPeso() >= 50 && artefacto.getPeso() <= 79) {
            artefacto.setPrecio(artefacto.getPrecio() + 800);
        } else if (artefacto.getPeso() >= 80) {
            artefacto.setPrecio(artefacto.getPrecio() + 1000);
        } else {
            System.out.println("RANGO DE PESO FUERA DE FORMATO");
        }
    }

    @Override
    public String toString() {
        return "\n precio: $ " + precio + ", color: " + color + "\n clasificacion consumo: " + consumo + ", peso: " + peso + " Kg.";
    }

    
    
}
