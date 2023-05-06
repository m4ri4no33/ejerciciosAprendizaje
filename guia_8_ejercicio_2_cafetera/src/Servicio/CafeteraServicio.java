/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe
el tamaño de la taza y simula la acción de servir la taza con la capacidad 
indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, 
se sirve lo que quede. El método le informará al usuario si se llenó o no la taza,
y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, 
el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafetera) {

        int capMax = cafetera.getCapacidadMaxima();
        int capAct = cafetera.getCantidadActual();
        int llenar;
        System.out.println("La capacidad MAXIMA es: " + cafetera.getCapacidadMaxima());
        System.out.println("La cantidad ACTUAL es: " + cafetera.getCantidadActual());
        System.out.println("Ingrese cantidad para llenar la CAFETERA ");
        llenar = leer.nextInt();
        if (llenar > capMax) {
            System.out.println("No es posible llenar, supera la CAPACIDAD MAXIMA ahora tiene: " + cafetera.getCantidadActual());
        }else if (capAct + llenar > capMax) {
            System.out.println("No es posible llenar, supera la CAPACIDAD MAXIMA ahora tiene: " + cafetera.getCantidadActual());
        } else {
        cafetera.setCantidadActual(capAct + llenar);
        }
    }

    public void servirTaza(Cafetera cafetera) {
        int op;
        System.out.println("Ingrese el tamaño de cafe deseado: ");
        System.out.println("Tamaño 1: 60 ml ");
        System.out.println("Tamaño 2: 90 ml");
        System.out.println("Tamaño 3: 215 ml");
        op = leer.nextInt();
        switch (op) {
            case 1:
                if (cafetera.getCantidadActual() >= 60) {
                    System.out.println("Se sirvio su cafe");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - 60);
                } else {
                    System.out.println("Se sirvio su cafe con: " + cafetera.getCantidadActual());
                    System.out.println("Su taza no se lleno por completo");
                    cafetera.setCantidadActual(0);

                }
                break;

            case 2:
                if (cafetera.getCantidadActual() >= 90) {
                    System.out.println("Se sirvio su cafe");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - 90);

                } else {
                    System.out.println("Se sirvio su cafe con: " + cafetera.getCantidadActual());
                    System.out.println("Su taza no se lleno por completo");
                    cafetera.setCantidadActual(0);

                }
                break;
            case 3:
                if (cafetera.getCantidadActual() >= 215) {
                    System.out.println("Se sirvio su cafe");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - 215);

                } else {
                    System.out.println("Se sirvio su cafe con: " + cafetera.getCantidadActual());
                    System.out.println("Su taza no se lleno por completo");
                    cafetera.setCantidadActual(0);

                }
                break;
        }

    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Ingrese cantidad de cafe a agregar: ");
        int cafe = leer.nextInt();
        
        if (cafetera.getCantidadActual()+ cafe <= cafetera.getCapacidadMaxima()){
            cafetera.setCantidadActual(cafetera.getCantidadActual()+cafe);
            System.out.println("Se agrego "+ cafe +  " ml de cafe");
        } else {
            int capMax = cafetera.getCapacidadMaxima()- cafetera.getCantidadActual();
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("Se lleno la cafeterra con " +capMax+" ml de cafe, no se pudo agregar "+(cafe - capMax)+" ml");
            
        }

    }

}
