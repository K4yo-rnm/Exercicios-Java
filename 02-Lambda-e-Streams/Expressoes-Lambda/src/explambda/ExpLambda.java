/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package explambda;

/**
 *
 * @author care-
 */
public class ExpLambda {
    
    interface Somador{
        int sum(int a, int b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Somador somador = (x, y) -> x + y;
        
        int result = somador.sum(5, 6);
        
        System.out.println("Sum: 5, 6: " + result);
    }
    
}
