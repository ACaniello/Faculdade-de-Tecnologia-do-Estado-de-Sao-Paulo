/*
4 - Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 */
package academy.learnprogramming.Temperature;

import javax.swing.JOptionPane;

public class Temperature {

    public static void main(String[] args){
        double c, f;
        c = Double.parseDouble(JOptionPane.showInputDialog("Enter the temperature in Celsius"));
        f = (9*c+160)/5;
        JOptionPane.showMessageDialog(null, "The temperature in Fahrenheit is " + f + "ºF.");
    }
}
