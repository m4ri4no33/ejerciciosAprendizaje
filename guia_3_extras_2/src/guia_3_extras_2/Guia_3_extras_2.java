
package guia_3_extras_2;

/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de 
D y D tome el valor de B. Mostrar los valores iniciales y los valores finales 
de cada variable. Utilizar sólo una variable auxiliar. 
 * @author Mariano Benegas
 */
public class Guia_3_extras_2 {

   
    public static void main(String[] args) {
        int A, B, C, D, aux;
        A = 10;
        B = 20;
        C = 30;
        D = 40;
        System.out.println("A "+A+", B "+B+", C "+C+", D "+D );
        aux = B;
        
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A "+A+", B "+B+", C "+C+", D "+D );
        
    }
    
}
