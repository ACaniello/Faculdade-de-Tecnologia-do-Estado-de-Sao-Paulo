/*
7 - Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 */
package academy.learnprogramming.Cobblestone;

import javax.swing.JOptionPane;

public class Cobblestone {

    public static void main (String args[]){
        double length, width, height, volume;
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the cobblestone in cm"));
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the cobblestone in cm"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the cobblestone in cm"));
        volume = length * height * width;
        JOptionPane.showMessageDialog(null, "The volume is " + volume + "cm³",
                length + "cm length, \n "
                        + width + "cm width, "
                        + height + "cm height.", JOptionPane.INFORMATION_MESSAGE);
    }
}
