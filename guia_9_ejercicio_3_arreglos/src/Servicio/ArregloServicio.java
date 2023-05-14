/*
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números 
aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, 
mostrar A y B.
 */
package Servicio;

import java.util.Arrays;


/*
 * @author Mariano Benegas
 */
public class ArregloServicio {

    public void inicializarA(double[] vec) {

        for (int i = 0; i < 50; i++) {
            vec[i] = Math.random() * 100;
        }

    }

    public void mostrar(double[] vec) {
        System.out.println("VECTOR" + "\n" + Arrays.toString(vec));
    }

    public void ordenar(double[] vec) {
        double[] aux = new double[50];
        aux = vec.clone();
        Arrays.sort(aux);
        for (int i = 49; i < 0; i--) {
            aux[i] = vec[i];
        }
        System.out.println("VECTOR" + "\n" + Arrays.toString(aux));

    }

    public void inicializarB(double[] vecA, double[] vecB) {
        System.arraycopy(vecA, 0, vecB, 0, 10);

        for (int i = 10; i < 20; i++) {
            vecB[i] = 0.5;
        }
    }
}
