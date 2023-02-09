/*
31 - Calcule e mostre o quadrado dos números entre 10 e 150.
*/
package academy.learnprogramming.Showthesquareofnumbers;

import javax.swing.JOptionPane;

public class Showthesquareofnumbers {

    public static void main(String[] args) {
        for (int i = 10; i <= 150; i++) {
            int n = i*i;
            System.out.println(n);
        }
    }
}
