/*
18 - Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
*/
package academy.learnprogramming.Differencefromthelargesttothesmallestvalue;

import javax.swing.JOptionPane;

public class Differencefromthelargesttothesmallestvalue 
/* 
{
    public static void main(String[] args){
        int a, b, difference;
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer value"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer value"));

            if (a > b) {
                difference = a-b;
            } else {
                difference = b-a;
            }
            JOptionPane.showMessageDialog(null, "The difference from the largest to the smallest number reported is " + difference + ".");
    }
}
*/
     {
	
	static int a,b,diferenca;
	public static void main(String[] args) {
	capturarInformacoes();
	calcular();
	menssagem();
	}
	
	
	static void capturarInformacoes() {
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));	
	}

	
	static void calcular() {
		if(a>b) {
			diferenca = a-b;
		}else {
			diferenca = b-a;
		}		
	}

	
	static void menssagem() {
		JOptionPane.showMessageDialog(null, "A diferença do maior para o menor número informado é " + diferenca + ".");
	}
}
