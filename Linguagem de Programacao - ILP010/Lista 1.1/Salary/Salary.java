/*
2 - Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
*/
package academy.learnprogramming.Salary;

import javax.swing.JOptionPane;

public class Salary {

    public static void main(String[] args){
        double salary, newSalary;
        salary = Double.parseDouble(JOptionPane.showInputDialog("Inform the current salary"));
        newSalary = salary + (salary*0.15);
        JOptionPane.showMessageDialog(null, "The salary " + salary + "with a 15% readjustment is: " + newSalary);
    }
}
