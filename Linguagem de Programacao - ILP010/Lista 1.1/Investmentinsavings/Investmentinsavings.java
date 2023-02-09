/*
8 - Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 */
package academy.learnprogramming.Investmentinsavings;

import javax.swing.JOptionPane;

public class Investmentinsavings {

    public static void main(String args[]){
        double deposit, yield, balance;
        balance = 0;
        deposit = Double.parseDouble(JOptionPane.showInputDialog("Enter the deposit amount"));
        yield = 0.013;
        balance += deposit;
        balance += (balance * yield);
        JOptionPane.showMessageDialog(null, "After" + 1 + "month the value will be " + balance + ".",
                yield + "per month", JOptionPane.INFORMATION_MESSAGE);
    }
}
