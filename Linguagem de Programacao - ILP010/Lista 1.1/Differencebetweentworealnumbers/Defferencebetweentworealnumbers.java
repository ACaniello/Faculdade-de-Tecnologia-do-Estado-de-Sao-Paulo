/*
10 - Receba 2 números reais. Calcule e mostre a diferença desses valores
*/

package academy.learnprogramming.Differencebetweentworealnumbers;

import javax.swing.JOptionPane;

public class Defferencebetweentworealnumbers {

    public static void main(String args[]){
        int a, b, difference;
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer"));
        difference = a - b;
        JOptionPane.showMessageDialog(null, a + "-" + b + "=" + difference,
                "Difference is the result of subtraction", JOptionPane.INFORMATION_MESSAGE);
    }
}
