/*
6 - Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 */
package academy.learnprogramming.Exchangeofvalues;

import javax.swing.JOptionPane;

public class Exchangeofvalues {

    public static void main(String args []){
        int a, b, x;
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer for A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer for B"));
        x = a;
        a = b;
        b = x;
        JOptionPane.showMessageDialog(null, "B=" + b + " \nA=" + a, "Informed A=" + b + " e B=" + a, JOptionPane.INFORMATION_MESSAGE);
    }
}
