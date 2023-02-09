/*
11 - Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
*/
package academy.learnprogramming.Showthecircumferencelength;

import javax.swing.JOptionPane;

public class Showthecircumferencelength {

    public static void main(String[] args){
        double circumference, radius;

        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle in cm"));
        circumference = 2*Math.PI*radius;

        JOptionPane.showMessageDialog(null, "The circumference for that radius " + radius + "cm is " + circumference + "cm.",
                "two pi radius...", JOptionPane.INFORMATION_MESSAGE);
    }
}
