/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01_interfaces.models;

import pkg01_interfaces.interfaces.Rueda;

/**
 *
 * @author capdoo
 */
public class Carro implements Rueda{

    public Carro() {
    }
    
    public void avanzar() {
        System.out.println("El carro avanza");
    }

    
    public void detener() {
        System.out.println("El carro se detiene");
    }
    
    
    
}
