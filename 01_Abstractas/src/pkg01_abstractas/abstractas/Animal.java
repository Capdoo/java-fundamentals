/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01_abstractas.abstractas;

/**
 *
 * @author capdoo
 */
public abstract class Animal {
    
    private String nombre;
    
    public Animal(){
        
    }
    
    public void comer(){
        System.out.println("El nombre "+nombre+" esta comiendo");
    }

    public abstract void moverse();
    
    public void setNombre(String s){
        this.nombre = s;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}







