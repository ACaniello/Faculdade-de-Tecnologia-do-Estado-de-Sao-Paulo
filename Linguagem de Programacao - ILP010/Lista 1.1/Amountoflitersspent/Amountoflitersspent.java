/*
17 - Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/
package academy.learnprogramming.Amountoflitersspent;

import javax.swing.JOptionPane;

public class Amountoflitersspent {

    public static void main (String[] args){
        int time, averageSpeed, efficiency;
        double distance, spentLiters;

        efficiency = 12;
        time = Integer.parseInt(JOptionPane.showInputDialog("Enter travel time in hours"));
        averageSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter the avarege speed in KM/h"));
        distance = time*averageSpeed;
        spentLiters = distance/efficiency;

        JOptionPane.showMessageDialog(null,
                "Moving by " + time + "hours in " + averageSpeed + "average KM/h," +
                        "you moved " + distance + "Km. \n" +
                        "With an expense of " + efficiency + "liters per KM you spent " + spentLiters + " liters.");
    }
}
