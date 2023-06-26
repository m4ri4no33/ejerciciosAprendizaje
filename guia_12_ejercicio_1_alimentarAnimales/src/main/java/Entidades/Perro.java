/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Mariano Benegas
 */
public class Perro extends Animal{
    //CONSTRUCTOR CON HERENCIA
    
    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
            
    @Override
    public void alimentarse(){
        super.alimentarse();
        System.out.println(super.getNombre());
        System.out.println(super.getAlimento());
        System.out.println("-------------------------------------------");
    }
         
    
}
