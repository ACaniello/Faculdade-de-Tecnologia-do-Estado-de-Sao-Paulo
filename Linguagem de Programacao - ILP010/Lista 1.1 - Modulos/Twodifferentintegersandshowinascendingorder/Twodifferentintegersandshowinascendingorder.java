/*
22  - Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
*/
package academy.learnprogramming.Twodifferentintegersandshowinascendingorder;

import javax.swing.*;

public class Twodifferentintegersandshowinascendingorder 

/*
{
    public static void main(String[] args){

        int a, b;

        a = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer"));

        if(a<b){
            JOptionPane.showMessageDialog(null, "In ascending order the numbers entered were:\n:\n"
                    + " " + a + " \n " + b, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "In ascending order the numbers entered were:\n:\n"
                    + " " + b + " \n " + a, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
*/
    {

	static int a,b;

	public static void main(String[] args) {
		capturarInformacao();
		compararExibir();
	}

	
	static void capturarInformacao() {
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um número diferente"));
	}
	
	static void compararExibir() {
		if(a<b) {
			JOptionPane.showMessageDialog(null, "Em ordem crescente os números digitados foram:\n"
					+ " " + a + " \n " + b, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Em ordem crescente os números digitados foram:\n"
					+ " " + b + " \n " + a, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
