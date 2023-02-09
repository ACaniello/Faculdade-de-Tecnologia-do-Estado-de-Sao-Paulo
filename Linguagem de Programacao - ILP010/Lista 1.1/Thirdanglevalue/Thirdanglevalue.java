/*
14 - Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
*/
package academy.learnprogramming.Thirdanglevalue;

import javax.swing.JOptionPane;

public class Thirdanglevalue {

    public static void main(String args[]){
        double a, b, c;
        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of angle A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of angle B"));
        c = 180-(a+b);
        JOptionPane.showMessageDialog(null, "Angle c is " + c + ".", "A=" + a + ", B=" + b, JOptionPane.INFORMATION_MESSAGE);
    }
}
