/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01_abstractas.model;

import pkg01_abstractas.abstractas.Animal;

/**
 *
 * @author capdoo
 */
public class Ave extends Animal{

    public Ave(){
        super();
        setNombre("Ave");
    }
    
    public void moverse() {
        System.out.println("El ave esta volando");
    }
   
    
    
}








