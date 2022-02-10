/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01_abstractas;

import pkg01_abstractas.abstractas.Animal;
import pkg01_abstractas.model.Ave;
import pkg01_abstractas.model.Perro;

/**
 *
 * @author capdoo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Perro perro = new Perro();
        Animal perro = new Perro();

        perro.comer();
        perro.moverse();
        
        //Ave ave = new Ave();
        Animal ave = new Ave();
        ave.comer();
        ave.moverse();
    }
    
}
