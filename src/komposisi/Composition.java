/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komposisi;

/**
 *
 * @author Annisa Olga Z
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Car SiPitung = new Car ("Honda");
	System.out.println("Mobilku "+SiPitung.getEngine().getJenis());
    }
    
}
