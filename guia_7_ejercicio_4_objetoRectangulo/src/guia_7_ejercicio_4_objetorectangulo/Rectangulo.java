package guia_7_ejercicio_4_objetorectangulo;

import java.util.Scanner;

/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para
crear el rectángulo con los datos del Rectángulo dados por el usuario. También
incluirá un método para calcular la superficie del rectángulo y un método para 
calcular el perímetro del rectángulo. Por último, tendremos un método que 
dibujará el rectángulo mediante asteriscos usando la base y la altura.
Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.


 * @author Mariano Benegas
 */
public class Rectangulo {

    private int base, altura;

    public void crearRectangulo() {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese base luego altura");
        base = Leer.nextInt();
        altura = Leer.nextInt();
    }

    public void calcularSuperficie() {
        int superficie;
        superficie = this.base * this.altura;
        System.out.println("La superficie es: " + superficie);
    }

    public void calcularPerimetro() {
        int perimetro;
        perimetro = (this.base + this.altura) * 2;
        System.out.println("El perimetro es: " + perimetro);
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void rectanguloDibujado() {

        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if ((i == 0) || (i == (base - 1)) || (j == 0) || (j == (altura - 1))) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println(" ");
        }

    }

}
