/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constrtutorparametrizado;

/**
 *
 * @author care-
 */
public class ConstrtutorParametrizado{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome, color;
        
        Dog myBull = new Dog("Bull", "Marrom");
        
        System.out.println(myBull.getNome());
        System.out.println(myBull.getColor());
    }
    
}
