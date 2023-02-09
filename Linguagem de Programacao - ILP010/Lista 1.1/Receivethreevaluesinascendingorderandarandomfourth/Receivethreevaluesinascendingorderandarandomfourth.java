/*
23 - Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
*/
package academy.learnprogramming.Receivethreevaluesinascendingorderandarandomfourth;

import javax.swing.JOptionPane;

public class Receivethreevaluesinascendingorderandarandomfourth {

    public static void main(String[] args) {

        double a, b, c, d;

        a = Double.parseDouble(JOptionPane.showInputDialog("Enter any number"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter a number greater than previous one"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Enter a number greater than previous one"));
        d = Double.parseDouble(JOptionPane.showInputDialog("Enter any number"));

        if(d>=c) {
            JOptionPane.showMessageDialog(null, a + "\n " + b + "\n " + c + "\n " + d + "\n",
                    "A = " + a + " | B = " + b + " | C = " + c + " | D = " +d, JOptionPane.INFORMATION_MESSAGE);
        }else if(d>=b && d<=c) {
            JOptionPane.showMessageDialog(null, a + "\n " + b + "\n " + d + "\n " + c + "\n",
                    "A = " + a + " | B = " + b + " | C = " + c + " | D = " +d, JOptionPane.INFORMATION_MESSAGE);
        }else if(d>=a && d<=b) {
            JOptionPane.showMessageDialog(null, a + "\n " + d + "\n " + b + "\n " + c + "\n",
                    "A = " + a + " | B = " + b + " | C = " + c + " | D = " +d, JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, d + "\n " + a + "\n " + b + "\n " + c + "\n",
                    "A = " + a + " | B = " + b + " | C = " + c + " | D = " +d, JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
