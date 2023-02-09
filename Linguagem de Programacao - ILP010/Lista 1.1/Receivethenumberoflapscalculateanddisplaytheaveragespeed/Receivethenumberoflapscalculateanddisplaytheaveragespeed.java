/*
27 | Receivethenumberoflapscalculateanddisplaytheaveragespeed | - Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
*/
package academy.learnprogramming.Receivethenumberoflapscalculateanddisplaytheaveragespeed;

import javax.swing.JOptionPane;

public class Receivethenumberoflapscalculateanddisplaytheaveragespeed {

    public static void main(String[] args) {

        int numberOfLaps, timeOfDuration;
        double extension, averageSpeed;

        numberOfLaps = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of laps"));
        extension = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the circuit in meters"))/1000;
        timeOfDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter the duration in minutes"))/60;
        averageSpeed = (extension * numberOfLaps)/timeOfDuration;

        JOptionPane.showMessageDialog(null, "Travelled distance: " + (extension*numberOfLaps) + "Km \n Average speed: " + averageSpeed + "Km/h", JOptionPane.INFORMATION_MESSAGE);

    }
}
