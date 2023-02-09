/*
32 - Receba um número inteiro. Calcule e mostre o seu factorial.
*/
package academy.learnprogramming.Calculateanddisplayitsfactorial;

import javax.swing.JOptionPane;

public class Calculateanddisplayitsfactorial 

/*
{
    public static void main(String[] args) {
        int n, factorial;
        factorial = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
        for(int i=1; i<=n; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, n + "!="+factorial);
    }
}
*/
    {

	public static void main(String[] args) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		
		JOptionPane.showMessageDialog(null, n + "!="+fatorial(n));
		}
	
	public static int fatorial(int n) {
		return n== 1? n: n * fatorial(n-1);
	}
}
