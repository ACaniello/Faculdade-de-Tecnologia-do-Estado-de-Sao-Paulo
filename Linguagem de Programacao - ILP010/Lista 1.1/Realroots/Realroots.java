/*
5 - Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
 */

package academy.learnprogramming.Realroots;

import javax.swing.JOptionPane;

public class Realroots {

    public static void main(String args[]){
        int a, b, c;
        double delta, root1, root2;
        a = Integer.parseInt(JOptionPane.showInputDialog("Report the value of a"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Report the value of b"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Report the value of c"));
        delta = (b*b) - 4 * a * c;
        root1 = (-b + Math.sqrt(delta))/2*a;
        root2 = (-b - Math.sqrt(delta))/2*a;

        JOptionPane.showMessageDialog(null, "The root 1 is " + root1 + " and root 2 is " + root2 + ".",
                a +"x²+" + b + "x+" + c + "=0",JOptionPane.INFORMATION_MESSAGE);
    }
}
