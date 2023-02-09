/*
36 - Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
*/

package academy.learnprogramming.Calculateanddisplaytheseriesn;

import javax.swing.JOptionPane;

public class Calculateanddisplaytheseriesn 

/*
{
    public static void main(String[] args) {

        double n, r, factorial,num;
        int f = 1;

        n = Double.parseDouble(JOptionPane.showInputDialog("Enter any number"));
        r=0;
        
        factorial = 0;
        num = n;
        
        for (double i = 1;i<=n;i++) {
            for (double j = num; j>=1; j--) {
                f *= j;
            }
            factorial = f;
            f = 1;
            num -=1;
            r += (1/factorial);
        }
        JOptionPane.showMessageDialog(null, r, "1! + 1/2!+ ... + 1/N!", JOptionPane.INFORMATION_MESSAGE);
    }
}
*/
    {

	public static void main(String[] args) {
		double n, r;
		n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número qualquer"));
		r=0;
		for (double i = 1;i<=n;i++) {
			r += (1/fatorial(i));
		}
		JOptionPane.showMessageDialog(null, r, "1! + 1/2!+ ... + 1/N!", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static double fatorial(double n) {
		if(n==0) {
			return 1;
		}else {
			return n * fatorial(n-1);
		}
	}
}
