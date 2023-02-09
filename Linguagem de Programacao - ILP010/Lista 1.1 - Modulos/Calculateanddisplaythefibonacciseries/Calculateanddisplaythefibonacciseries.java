/*
37 - Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
*/

package academy.learnprogramming.Calculateanddisplaythefibonacciseries;

import javax.swing.JOptionPane;

public class Calculateanddisplaythefibonacciseries 

/*
{
    public static void main(String[] args) {

        int tn, t1, t2, fibonacci;
        do {
            tn = Integer.parseInt(JOptionPane.showInputDialog("Inform which term of the Fibonacci sequence you want to know"));
        } while(tn<=0);

        t1 = 1;
        t2 = 1;
        fibonacci = 0;

        if(tn == 1 || tn == 2) {
            fibonacci = 1;
        } else {
            for(int i = 3; i<=tn; i++) {
                fibonacci = t1 + t2;
                t1 = t2;
                t2 = fibonacci;
            }
        }

        JOptionPane.showMessageDialog(null, fibonacci, tn + "º Term", JOptionPane.INFORMATION_MESSAGE);
    }
*/
    {

	public static void main(String[] args) {
		int tn;
		tn = Integer.parseInt(JOptionPane.showInputDialog("Informe qual termo da sequência Fibonacci deseja saber"));
		JOptionPane.showMessageDialog(null, calculaFibonacci(tn), tn + "º Termo", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int calculaFibonacci(int n) {
		if(n<=2){
			return 1;
		}else {
		return calculaFibonacci(n-1) + calculaFibonacci(n-2);	
		}
	}

}
