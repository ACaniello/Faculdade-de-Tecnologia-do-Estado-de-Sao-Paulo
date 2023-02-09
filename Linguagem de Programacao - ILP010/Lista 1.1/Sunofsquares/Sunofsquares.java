/*
9 - Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
*/
package academy.learnprogramming.Sunofsquares;

import javax.swing.JOptionPane;

public class Sunofsquares {

    public static void main(String args[]){
        int a, b, sun;
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
        sun = (a*a) + (b*b);
        JOptionPane.showMessageDialog(null, "The sun of the square of " + a + "with the square of " + b + " is " + sun + ".",
                (a*a)+"+"+(b*b), JOptionPane.INFORMATION_MESSAGE);
    }
}





