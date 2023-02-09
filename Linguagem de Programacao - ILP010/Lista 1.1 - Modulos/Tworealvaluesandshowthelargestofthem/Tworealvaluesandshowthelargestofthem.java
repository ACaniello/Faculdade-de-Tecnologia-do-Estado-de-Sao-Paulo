/*
19 - Receba 2 valores reais. Calcule e mostre o maior deles.
*/
package academy.learnprogramming.Tworealvaluesandshowthelargestofthem;

import javax.swing.JOptionPane;

public class Tworealvaluesandshowthelargestofthem 
/*
{

    public static void main(String[] args) {
        double a,b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Enter any number"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter any number"));

        if (a > b) {
            JOptionPane.showMessageDialog(null, "The highest number entered was " + a + ".",
                    "You typed " + a + " and " + b, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The highest number entered was " + b + ".",
                    "You typed " + a + " and " + b, JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }
    */
     {
	
	static double a, b;
	public static void main(String[] args) {
		capturarInformacoes();
		comparar();
		menssagem();
	}
	
	
	static void capturarInformacoes() {
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe um  número qualquer"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe um  número qualquer"));
		
	}

	static void comparar() {
		if(a>b) {
			JOptionPane.showMessageDialog(null, "O maior número digitado foi " + a + ".","Você digitou " + a + " e " + b, JOptionPane.INFORMATION_MESSAGE);
		}else {
		}
		
	}
	
	static void menssagem() {
		JOptionPane.showMessageDialog(null, "O maior número digitado foi " + b + ".","Você digitou " + a + " e " + b, JOptionPane.INFORMATION_MESSAGE);
		
	}
