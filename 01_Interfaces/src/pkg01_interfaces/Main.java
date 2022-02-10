/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01_interfaces;

import pkg01_interfaces.models.Bicicleta;
import pkg01_interfaces.models.Carro;

/**
 *
 * @author capdoo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();
        
        carro.avanzar();
        bicicleta.avanzar();

    }
    
}
