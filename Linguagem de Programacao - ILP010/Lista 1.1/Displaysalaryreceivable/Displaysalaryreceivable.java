/*
16 | Displaysalaryreceivable | - Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
*/
package academy.learnprogramming.Displaysalaryreceivable;

import javax.swing.JOptionPane;

public class Displaysalaryreceivable {

    public static void main(String args[]){
        int numberOfhourworked, dependentQuantity;
        double hourValue, discount, grossSalary, netSalary, salaryReceivable;
        numberOfhourworked = Integer.parseInt(JOptionPane.showInputDialog("Report the number os hours worked"));
        hourValue = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount paid per hour"));
        discount = Double.parseDouble(JOptionPane.showInputDialog("Enter the discount percentage"));
        dependentQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of dependents"));
        grossSalary = numberOfhourworked * hourValue;
        netSalary = grossSalary - (grossSalary*discount);
        salaryReceivable = netSalary + dependentQuantity;

        JOptionPane.showMessageDialog(null,
                 "Worked hours: " + numberOfhourworked + "h \n"
                        + "Hourly Value: BRL " + hourValue + " \n"
                        + "Discount " + discount*100 + "% \n"
                        + "Dependents " + dependentQuantity/100 + " \n"
                        + "Gross Salary: BRL " + grossSalary + " \n"
                        + "Net Salary: BRL " + netSalary + " \n"
                        + "Total Receivable: BRL " = salaryReceivable, "Salary Calculation", JOptionPane.INFORMATION_MESSAGE);
    }
}
