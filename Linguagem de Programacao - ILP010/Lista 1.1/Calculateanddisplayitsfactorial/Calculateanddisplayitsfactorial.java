/*
32 - Receba um número inteiro. Calcule e mostre o seu factorial.
*/
package academy.learnprogramming.Calculateanddisplayitsfactorial;

import javax.swing.JOptionPane;

public class Calculateanddisplayitsfactorial {

    public static void main(String[] args) {
        int n, factorial;
        factorial = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
        for(int i=1; i<=n; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, n + "!="+factorial);
    }
}
