/*
15 - Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
*/
package academy.learnprogramming.Hypotenusecalculation;

import javax.swing.JOptionPane;

public class Hypotenusecalculation {

    public static void main(String[] args){
        double a, b, h, h2;
        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the adjcent side"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the opposing side"));
        h2 = (a*a)+(b*b);
        h = Math.sqrt(h2);
        JOptionPane.showMessageDialog(null, a + "²+" + b + "²=" + h + "².\n"
                + "Soon, " + a*a + "+" + b*b + "=" + h2 + ". Since the value of the hypotenuse " + h + ".", "a²=b²+c²", JOptionPane.INFORMATION_MESSAGE);
    }
}
