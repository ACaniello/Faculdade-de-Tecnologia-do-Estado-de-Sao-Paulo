/*
29 - Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
*/
package academy.learnprogramming.Receivethetypeofinvestmentandshowthecorrectedamount;

import javax.swing.JOptionPane;

public class Receivethetypeofinvestmentandshowthecorrectedamount 

/*
{
    public static void main(String args[]){

        int typeOfInvestment;
        double valueInvestment, correctedValue;

        typeOfInvestment = Integer.parseInt(JOptionPane.showInputDialog("Enter the type of investment\n 1 for savings \n 2 for fixed income"));
        valueInvestment = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to be invested"));

        if(typeOfInvestment == 1) {
            correctedValue = valueInvestment + (valueInvestment * 0.03);
        }else if(typeOfInvestment == 2) {
            correctedValue = valueInvestment + (valueInvestment*0.05);
        }else {
            correctedValue = valueInvestment;
        }
        JOptionPane.showMessageDialog(null, "In 30 days the amount invested, " + valueInvestment + ", it will be " + correctedValue + ".",
                "Savings: 3%a.m. | Fixed Income: 5%a.m.", JOptionPane.INFORMATION_MESSAGE);
    }
}
*/
    {

	static int tipoDeInvestimento;
	static double valorInvestimento, valorCorrigido;
	public static void main(String args[]){
		coletarInformacao();
		calcular();
		exibir();
	}
	
	static void coletarInformacao(){
		tipoDeInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de investimento\n 1 para poupança\n 2 para renda fixa"));
		valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser investido"));
	}
	
	static void calcular(){
		if(tipoDeInvestimento == 1) {
			valorCorrigido = valorInvestimento + (valorInvestimento * 0.03);
		}else if(tipoDeInvestimento == 2) {
			valorCorrigido = valorInvestimento + (valorInvestimento*0.05);
		}else {
			valorCorrigido = valorInvestimento;
		}
	}
	
	static void exibir(){
		JOptionPane.showMessageDialog(null, "Em 30 dias o valor investido, " + valorInvestimento + ", será " + valorCorrigido + ".", 
				"Poupança: 3%a.m. | RendaFixa: 5%a.m.", JOptionPane.INFORMATION_MESSAGE);
	}
}
