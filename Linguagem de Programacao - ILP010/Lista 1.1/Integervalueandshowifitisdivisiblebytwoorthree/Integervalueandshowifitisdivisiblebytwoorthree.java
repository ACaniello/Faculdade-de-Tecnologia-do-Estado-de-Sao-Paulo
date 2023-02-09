/*
24 - Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
*/
package academy.learnprogramming.Integervalueandshowifitisdivisiblebytwoorthree;

import javax.swing.JOptionPane;

public class Integervalueandshowifitisdivisiblebytwoorthree {

    public static void main(String[] args) {

        int a;

        a = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));

        if(a%2 == 0 && a%3 == 0) {
            JOptionPane.showMessageDialog(null, "The number is divisible by 2 and 3",
                    "Number = " + a, JOptionPane.INFORMATION_MESSAGE);
        } else if(a%2 == 0 && a%3 != 0) {
            JOptionPane.showMessageDialog(null, "The number is divisible by 2 but not by 3",
                    "Number = " + a, JOptionPane.INFORMATION_MESSAGE);
        } else if(a%2 != 0 && a%3 == 0) {
            JOptionPane.showMessageDialog(null, "The number is not divisible by 2 but is divisible by 3",
                    "Number = " + a, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The number is not divisible by 2 or 3",
                    "Number = " + a, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

