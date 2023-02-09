/*
1 - Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
*/
package academy.learnprogramming;

import javax.swing.JOptionPane;

public class Square {

    public static void main (String[] args) {
        double side, area;
        side = Double.parseDouble(JOptionPane.showInputDialog("Enter the area of the square\n"));
        area = side*side;
        JOptionPane.showMessageDialog(null, "The area of the Square is: " + area);
    }
}