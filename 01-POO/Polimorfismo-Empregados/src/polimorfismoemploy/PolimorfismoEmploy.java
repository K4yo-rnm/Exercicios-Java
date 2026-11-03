
package polimorfismoemploy;

/**
 *
 * @author care-
 */
public class PolimorfismoEmploy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employ emp1 = new Empregado("Suvenil", 800.00, 1000.00);
        Employ emp2 = new Gerente("Marcos", 7000.00, 3456.00);
        
        System.out.println("Manager: " + emp1.getNome() + "\nRole: " + 
                emp1.getRole() + "\nSalario: " + emp1.CalculateSalary());
        
        System.out.println("\nManager: " + emp2.getNome() + "\nRole: " + 
                emp2.getRole() + "\nSalario: " + emp2.CalculateSalary());
    }
    
}
