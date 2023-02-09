/*
35 - Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da sumtória dos números ímpares entre esses valores.
*/
package academy.learnprogramming.Receivetwonumberandcheckwhichisthelargestamongthem;

import javax.swing.JOptionPane;

public class Receivetwonumberandcheckwhichisthelargestamongthem {

    public static void main(String[] args) {

        int n1, n2, sum;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another integer"));

        sum = 0;

        if(n1>n2) {
            for(int i = n2;i<=n1;i++) {
                if(i%2!=0) {
                    sum += i;
                }
            }
            JOptionPane.showMessageDialog(null, "The sum of the odd numbers between " + n2 + " and " + n1 + " is: " + sum + ".");
        }else {
            for(int i = n1; i<=n2; i++) {
                if(i%2!=0) {
                    sum+=i;
                }
            }
            JOptionPane.showMessageDialog(null, "The sum of the odd numbers between " + n1 + " and " + n2 + " is: " + sum + ".");
        }
    }
}
