/*
16 | Displaysalaryreceivable | - Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
*/
package academy.learnprogramming.Displaysalaryreceivable;

import javax.swing.JOptionPane;

public class Displaysalaryreceivable 
/*
{
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
                        + "Net Salary: BRL " + netSalary + " \n")
                        + "Total Receivable: BRL " = salaryReceivable, "Salary Calculation", JOptionPane.INFORMATION_MESSAGE);
    }
}
*/
    {
		static int qntHorasTrabalhadas, qntdDependentes;
		static double valorHora, desconto, salarioBruto, salarioLiquido, salarioAReceber;
		
		public static void main(String args[]) {
		
		qntHorasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de horas trabalhadas"));
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor pago por hora"));
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto"))/100;
		qntdDependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dependentes"))*100;
		calcularSalario();
		mostrar();
		
	}
	static void calcularSalario() {
		salarioBruto = qntHorasTrabalhadas * valorHora;
		salarioLiquido = salarioBruto - (salarioBruto*desconto);
		salarioAReceber = salarioLiquido + qntdDependentes;
	}
	
	static void mostrar() {
		JOptionPane.showMessageDialog(null, 
				"Horas Trabalhadas: " + qntHorasTrabalhadas + "h \n"
				+ "Valor Hora: R$ " + valorHora + " \n"
				+ "Desconto: " + desconto*100 + "% \n"
				+ "Dependentes: " + qntdDependentes/100 + " \n"
				+ "Salário Bruto: R$ " + salarioBruto + " \n"
				+ "Salário Líquido: R$ " + salarioLiquido + " \n"
				+ "Total à receber: R$ " + salarioAReceber, "Cálculo Salário", JOptionPane.INFORMATION_MESSAGE);
	}
}
    
