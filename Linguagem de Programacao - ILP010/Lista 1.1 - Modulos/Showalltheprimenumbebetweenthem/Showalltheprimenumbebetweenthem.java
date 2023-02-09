/*
40 - Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
*/
package academy.learnprogramming.Showalltheprimenumbebetweenthem;

import javax.swing.JOptionPane;

public class Showalltheprimenumbebetweenthem 

/*
{
    public static void main(String[] args) {

        int a, b,p;

        String m;
        p = 0;
        m = "";
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));

        if(a<b) {
            for(int i=a;i<=b;i++) {
                for(int j=1;j<=i;j++) {
                    if(i % j == 0) {
                        p++;
                    }
                }
                if(p==2) {
                    m = m + i + " ";
                    System.out.println(m);
                }
                p = 0;
            }
        } else {
            for(int i=b;i<=a;i++) {
                for(int j=1;j<=i;j++) {
                    if(i % j == 0) {
                        p++;
                    }
                }
                if(p==2) {
                    m = m + i + " ";
                    System.out.println(m);
                }
                p = 0;
            }
        }
        JOptionPane.showMessageDialog(null, "Between " + a + " and " + b + " we have prime numbers: " + m + ".", "PRIME", JOptionPane.INFORMATION_MESSAGE);
    }
}
*/
    {


	public static void main(String[] args) {
		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		if(a<b) {
			JOptionPane.showMessageDialog(null, "Entre " + a + " e " + b + " temos os número primos: " + primos(a,b) + ".", "PRIMOS", JOptionPane.INFORMATION_MESSAGE);
			;
		}else {
			JOptionPane.showMessageDialog(null, "Entre " + b + " e " + a + " temos os número primos: " + primos(b,a) + ".", "PRIMOS", JOptionPane.INFORMATION_MESSAGE);

			;
		}
	}

	public static String primos(int n1, int n2) {
		int p=0;
		String m="";
		for(int i=n1;i<=n2;i++) {
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					p++;
				}
			}
			if(p==2) {
				m +=i + " "; 
			}		
			p = 0;
		}
		return m;
	}
}
