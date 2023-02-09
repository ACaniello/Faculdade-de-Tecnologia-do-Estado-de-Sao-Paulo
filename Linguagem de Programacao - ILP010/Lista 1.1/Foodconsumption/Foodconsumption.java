/*
13 - Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
*/
package academy.learnprogramming.Foodconsumption;

import javax.swing.JOptionPane;

public class Foodconsumption {

    public static void main(String args[]){
        double amountFood, foodGrams, day;
        int days;
        amountFood = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of total food in kg"));
        foodGrams = amountFood*1000;
        day = foodGrams/50;
        days = (int) day;
        JOptionPane.showMessageDialog(null, amountFood + "Kg, consuming 50g per day will last " + days + ".", JOptionPane.INFORMATION_MESSAGE);
    }
}
