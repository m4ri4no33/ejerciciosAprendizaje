/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10eje3.Service;

import guia10eje3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MAURICIO
 */
public class AlumnoService {
    private  List<Alumno> listAlumnos = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void crearAlumno(){
        
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();
        ArrayList <Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota "+(i + 1));
            Integer nota = leer.nextInt();
            notas.add(nota);
        }
        Alumno var1 = new Alumno(nombre,notas);
        listAlumnos.add(var1);
        System.out.println("Desea crear otro alumno?, <S> para confirmar, otra tecla para salir");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("s")) {
            crearAlumno();
        }
    }
    public void notaFinal(){
        Double sumarNota = (double) 0;
        System.out.println("Ingrese el nombre del alumno");
        String resp = leer.next();
        Iterator<Alumno> it = listAlumnos.iterator();
        while(it.hasNext()){
            Alumno aux = it.next();
            if(aux.getNombre().equals(resp)){
                for (Integer notas : aux.getNota()) {
                    sumarNota += notas;
                }
                Double promedio = sumarNota/aux.getNota().size();
            }
        }
    }
}
