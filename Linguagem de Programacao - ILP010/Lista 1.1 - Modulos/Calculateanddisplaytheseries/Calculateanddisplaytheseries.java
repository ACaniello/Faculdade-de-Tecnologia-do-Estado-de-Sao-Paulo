/*
33 - Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
*/
package academy.learnprogramming.Calculateanddisplaytheseries;

import javax.swing.JOptionPane;

public class Calculateanddisplaytheseries 

/*
{
    public static void main(String[] args) {
        double n,r;
        n = Double.parseDouble(JOptionPane.showInputDialog("Enter any number"));
        r = 0;
        for (double i = 1;i<=n;i++) {
            r += (1/i);
        }
        JOptionPane.showMessageDialog(null, r, "1/1+1/2+...+1/N", JOptionPane.INFORMATION_MESSAGE);
    }
}
*/
    {

	public static void main(String[] args) {
		double n;
		n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número qualquer"));
		JOptionPane.showMessageDialog(null, s(n), "1/1+1/2+...+1/N", JOptionPane.INFORMATION_MESSAGE);
	}


	public static double s(double n){
		if(n==1) {
			return 1;
		}else{
			return 1/n + s(n-1);
		}
	}
}
