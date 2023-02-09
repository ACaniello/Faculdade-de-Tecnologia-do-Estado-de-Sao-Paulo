/*
25 - Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
*/
package academy.learnprogramming.Startandendtimeofagame;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Startandendtimeofagame {

    public static void main(String[] args) {

        int startTime, initialMinute, finalHour, finalMinute, gameTime, minuteGame;

        startTime = Integer.parseInt(JOptionPane.showInputDialog("Enter start time"));
        while (startTime <0 || startTime >= 24) {
            startTime = Integer.parseInt(JOptionPane.showInputDialog("Start time must be > than 0 and < than 24"));
        }

        initialMinute = Integer.parseInt(JOptionPane.showInputDialog("Enter the start minute"));
        while (initialMinute <0 || initialMinute >= 60) {
            initialMinute = Integer.parseInt(JOptionPane.showInputDialog("Start minute must be > than 0 and < than 24"));
        }

        finalHour = Integer.parseInt(JOptionPane.showInputDialog("Enter the End Time"));
        while (finalHour <0 || finalHour >= 24) {
            finalHour = Integer.parseInt(JOptionPane.showInputDialog("End time must be > than 0 and < than 24"));
        }

        finalMinute = Integer.parseInt(JOptionPane.showInputDialog("Enter the end minute"));
        while (finalMinute <0 || finalMinute >=60) {
            finalMinute = Integer.parseInt(JOptionPane.showInputDialog("End minute must b > than 0 and < than 24"));
        }

        minuteGame = finalMinute >= initialMinute ? finalMinute - initialMinute : (finalMinute+60) - initialMinute;

        gameTime = finalHour >= startTime ? finalHour - startTime : (finalHour + 24) - startTime;
        DecimalFormat df = new DecimalFormat("00");
        JOptionPane.showMessageDialog(null, df.format(gameTime) + ":" + df.format(minuteGame), "Test", JOptionPane.INFORMATION_MESSAGE);
    }
}
