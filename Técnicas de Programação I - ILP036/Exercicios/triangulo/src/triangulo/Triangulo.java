
package triangulo;

import javax.swing.JOptionPane;

public class Triangulo {

    public static void main(String[] args){
        double base, height, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base of the triangle"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the triangle"));
        area = (base * height)/2;

        JOptionPane.showMessageDialog(null, "The area of triangle base " + base + " and height " + height + " is " + area);
    }
}