/*
31 - Calcule e mostre o quadrado dos números entre 10 e 150.
*/
package academy.learnprogramming.Showthesquareofnumbers;

import javax.swing.JOptionPane;

public class Showthesquareofnumbers 

/*
{
    public static void main(String[] args) {
        for (int i = 10; i <= 150; i++) {
            int n = i*i;
            System.out.println(n);
        }
    }
}
*/
    {

	public static void main(String[] args) {
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número inicial"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número final"));
		//JOptionPane.showMessageDialog(null, quadrado(num1, num2), "Quadrado dos número tudo", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(quadrado(num1, num2));
	}
	
	public static String quadrado(int inicio, int fim) {
		String menssagem = "";
		for (int i = inicio; i <= fim/2; i++) {
			int n = (int)Math.pow(i, 2);
			menssagem += n + " \n " ;
		}
		return menssagem;
	}

}
