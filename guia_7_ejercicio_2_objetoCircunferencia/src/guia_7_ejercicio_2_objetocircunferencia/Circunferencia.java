package guia_7_ejercicio_2_objetocircunferencia;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado 
el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el
atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 * @author Mariano Benegas
 */
public class Circunferencia {

    private double radio;
    private double perimetro;
    private double area;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
    

    public double calcularArea(double radio) {

        area = ((Math.PI * radio) * (Math.PI * radio));
        return area;
        
    }
    public double calcularPerimetro(double radio){
        
        perimetro = (2*Math.PI*radio);
        return perimetro;
    }
}
