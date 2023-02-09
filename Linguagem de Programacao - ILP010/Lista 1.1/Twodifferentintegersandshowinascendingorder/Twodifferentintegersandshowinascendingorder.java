/*
22  - Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
*/
package academy.learnprogramming.Twodifferentintegersandshowinascendingorder;

import javax.swing.*;

public class Twodifferentintegersandshowinascendingorder {

    public static void main(String[] args){

        int a, b;

        a = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer"));

        if(a<b){
            JOptionPane.showMessageDialog(null, "In ascending order the numbers entered were:\n:\n"
                    + " " + a + " \n " + b, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "In ascending order the numbers entered were:\n:\n"
                    + " " + b + " \n " + a, "A = " + a + " | B = " + b, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

