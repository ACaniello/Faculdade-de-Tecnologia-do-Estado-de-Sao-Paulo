/*
44 - Receba o número da base e do exponent. Calcule e mostre o valor da potência.
*/
package academy.learnprogramming.Getthebaseandexponentnumber;

import javax.swing.JOptionPane;

public class Getthebaseandexponentnumber {

    public static void main(String[] args) {

        int base, exponent;

        base = Integer.parseInt(JOptionPane.showInputDialog("Enter the base"));
        exponent = Integer.parseInt(JOptionPane.showInputDialog("Enter the exponent"));

        JOptionPane.showMessageDialog(null,"The result is: " + (int)Math.pow(base, exponent) + " ", base + " ^ " + exponent,JOptionPane.INFORMATION_MESSAGE);
    }
}
