/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismoemploy;

/**
 *
 * @author care-
 */
public class Gerente extends Employ{
    
    private double salariobase, tempopay;
    
    public Gerente(String nome, double salariobase, double tempopay){
        super (nome, "Gerente");
        
        this.salariobase = salariobase;
        this.tempopay = tempopay;
    }
    
    @Override
    public double CalculateSalary(){
        return salariobase + tempopay;
    }
    
}
