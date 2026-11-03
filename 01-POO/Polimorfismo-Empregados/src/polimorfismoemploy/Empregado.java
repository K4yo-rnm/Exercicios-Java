/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismoemploy;

/**
 *
 * @author care-
 */
public class Empregado extends Employ{
    
    private double salariobase, bonus;
    
    public Empregado(String nome, double salariobase, double bonus){
        super (nome, "Empregado");
        
        this.salariobase = salariobase;
        this.bonus = bonus;
    }
    
    @Override
    public double CalculateSalary(){
        return salariobase + bonus;
    }
    
}
