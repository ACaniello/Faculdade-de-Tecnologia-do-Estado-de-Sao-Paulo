/*
45 - Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
*/
package academy.learnprogramming.Showthecalculationaboutthisseriesx;

import javax.swing.JOptionPane;

public class Showthecalculationaboutthisseriesx {

    public static void main(String[] args) {
        double s = 0;
        for(int i = 1; i<=15;i++) {
            s += i/(Math.pow(i, 2));
        }
        JOptionPane.showMessageDialog(null, s, "1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225", JOptionPane.INFORMATION_MESSAGE);
    }
}
