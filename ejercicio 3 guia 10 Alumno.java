/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10eje3.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAURICIO
 */
public class Alumno {
    private String nombre;
    private List<Integer> nota;

    public Alumno() {
    }

    public Alumno(String nombre, List<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNota() {
        return nota;
    }

    public void setNota(List<Integer> nota) {
        this.nota = nota;
    }

    
    
    
}
