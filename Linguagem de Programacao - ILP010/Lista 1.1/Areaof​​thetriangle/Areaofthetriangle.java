/*
3 - Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
*/
package academy.learnprogramming.Areaofthetriangle;

import javax.swing.JOptionPane;

public class Areaofthetriangle {

    public static void main(String[] args){
        double base, height, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base of the triangle"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the triangle"));
        area = (base * height)/2;

        JOptionPane.showMessageDialog(null, "The area of triangle base " + base + " and height " + height + " is " + area);
    }
}