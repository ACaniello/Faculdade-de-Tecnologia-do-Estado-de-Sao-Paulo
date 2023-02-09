/*
40 - Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
*/
package academy.learnprogramming.Showalltheprimenumbebetweenthem;

import javax.swing.JOptionPane;

public class Showalltheprimenumbebetweenthem {

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
