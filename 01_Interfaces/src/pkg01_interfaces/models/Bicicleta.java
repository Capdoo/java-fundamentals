/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01_interfaces.models;

import pkg01_interfaces.interfaces.Rueda;
import pkg01_interfaces.interfaces.Silla;

/**
 *
 * @author capdoo
 */
public class Bicicleta implements Rueda,Silla{

    public Bicicleta() {
    }

    public void avanzar() {
        System.out.println("La bicicleta avanza");
    }

    public void detener() {
        System.out.println("La bicicleta se detiene");
    }

    @Override
    public void sentarse() {
        System.out.println("Sentarse");
    }
    
    
}
