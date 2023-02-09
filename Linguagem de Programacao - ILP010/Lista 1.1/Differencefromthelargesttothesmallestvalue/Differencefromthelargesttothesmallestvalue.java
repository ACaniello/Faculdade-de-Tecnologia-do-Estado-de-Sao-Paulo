/*
18 - Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
*/
package academy.learnprogramming.Differencefromthelargesttothesmallestvalue;

import javax.swing.JOptionPane;

public class Differencefromthelargesttothesmallestvalue {

    public static void main(String[] args){
        int a, b, difference;
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer value"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer value"));

            if (a > b) {
                difference = a-b;
            } else {
                difference = b-a;
            }
            JOptionPane.showMessageDialog(null, "The difference from the largest to the smallest number reported is " + difference + ".");
    }
}
