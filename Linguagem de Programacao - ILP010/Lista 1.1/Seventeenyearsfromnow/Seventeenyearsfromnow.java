/*
12 - Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
*/
package academy.learnprogramming.Seventeenyearsfromnow;

import javax.swing.*;

public class Seventeenyearsfromnow {

    public static void main(String[] args){
        int yearBirth, currentYear, age, ageFuture;

        yearBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter your year of birth"));
        currentYear = Integer.parseInt(JOptionPane.showInputDialog("Enter the current year"));
        age = currentYear - yearBirth;
        ageFuture = age + 17;
        JOptionPane.showMessageDialog(null, "Your age in " + currentYear + " is " + age ". \n "
        + "In " + (currentYear+17) + "years will be " + ageFuture + ".", JOptionPane.INFORMATION_MESSAGE);
    }
}
