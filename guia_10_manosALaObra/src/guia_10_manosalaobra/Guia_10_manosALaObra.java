/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_manosalaobra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_10_manosALaObra {
    
    public static void main(String[] args) {
        //CORRECCION DE ERRORES
        ArrayList<Integer> listado = new ArrayList();//CREA UN ARRAY LIST DE NUMEROS
        int a = 10, b = 20, c = 30, d = 40, e = 50;
        listado.add(a);//AGREGO OBJETOS A LA LISTA
        listado.add(b);
        listado.add(c);
        listado.add(d);
        listado.add(e);
        
        TreeSet<Integer> arbol = new TreeSet();//CREA UN TRESET DE NUMEROS
        Integer f = 10, g = 20, h = 30, i = 40, j = 50;
        arbol.add(f);//agrego objetos al treset
        arbol.add(g);
        arbol.add(h);
        arbol.add(i);
        arbol.add(j);
        
        HashMap<Integer, String> personas = new HashMap(); //CREA UN MAPA DE PERSONAS
        int dni1 = 32374864;
        String nombre1 = "juan";
        personas.put(dni1, nombre1);//AGREGAMOS LA LLAVE Y EL VALOR
        int dni2 = 32374865;
        String nombre2 = "juance";
        personas.put(dni2, nombre2);
        int dni3 = 32374865;
        String nombre3 = "pedro";
        personas.put(dni3, nombre3);
        int dni4 = 32374866;
        String nombre4 = "juanon";
        personas.put(dni4, nombre4);
        int dni5 = 32374867;
        String nombre5 = "juanes";
        personas.put(dni5, nombre5);

        //ELIMINAR OBJETOS EN LISTA
        listado.remove(3);//eliminamos d
        listado.remove(Integer.valueOf(20));/*elimina el primer 20 que encuentra
        como valor agregar Integer.valueOf(valor a eliminar)
        */
        //CONJUNTOS
        arbol.remove(40);//elimina elemento que contiene 40
        //MAPA
        personas.remove(32374864);//ELIMINAMOS LA LLAVE DEL 1 VALOR

        //DETECCION DE ERRORES
        HashMap<Integer, String> persona = new HashMap();
        int llv1 = 123, llv2 = 321;
        String n1 = "Albus";
        String n2 = "Severus";
        persona.put(llv1, n1);
        persona.put(llv2, n2);

        //CREA UNA LISTA BEBIDAS AGREGGA DOS ELEMENTOS Y LUEGO BORRAMOS UNO CON ITERATOR
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
            
        }
        
        ArrayList<String> libros = new ArrayList();
        libros.add("Las Malvinas");
        libros.add("Historia del mundo");
        libros.add("Diccionario de Antonimos");
        for (String libro : libros) {
            System.out.println(libro);
        }
        
        
    }
}
