/*
34 - Receba um número. Calcule e mostre os resultados da table desse número.
*/
package academy.learnprogramming.Calculatemultiplicationtableofthisnumber;

import javax.swing.JOptionPane;

public class Calculatemultiplicationtableofthisnumber 

/*
{
    public static void main(String[] args) {

        int n,r;
        String table = "\n";

        n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to receive the multiplication table"));

        for(int i=10;i>=0;i--) {
            r = n * i;
            table = n+"x"+i+"="+r+"\n"+table;
        }
        JOptionPane.showMessageDialog(null, table, "table do " + n, JOptionPane.INFORMATION_MESSAGE);
    }
}
*/
    {

	public static void main(String[] args) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para receber a tabuada"));
		JOptionPane.showMessageDialog(null, tabuada(n), "Tabuada do " + n, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static String tabuada(int n) {
		String resultado = "\n";
		for(int i=10;i>=0;i--) {
			int r = n * i;
			resultado = n+"x"+i+"="+r+"\n"+resultado;
		}
		return resultado;
	}

}
