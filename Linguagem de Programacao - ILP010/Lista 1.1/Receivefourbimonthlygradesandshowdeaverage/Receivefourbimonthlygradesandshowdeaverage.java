/*
21 - Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.
*/
package academy.learnprogramming.Receivefourbimonthlygradesandshowdeaverage;

import javax.swing.JOptionPane;

public class Receivefourbimonthlygradesandshowdeaverage {

    public static void main(String[] args) {

        double g1, g2, g3, g4, average;

        g1 = Double.parseDouble(JOptionPane.showInputDialog("Entre the grade 1"));
        g2 = Double.parseDouble(JOptionPane.showInputDialog("Entre the grade 2"));
        g3 = Double.parseDouble(JOptionPane.showInputDialog("Entre the grade 3"));
        g4 = Double.parseDouble(JOptionPane.showInputDialog("Entre the grade 4"));
        average = (g1 + g2 + g3 +g4) / 4;

        if (average >= 6) {
            JOptionPane.showMessageDialog(null, "Average = " + average + " \n Approved", "Status", JOptionPane.INFORMATION_MESSAGE);
        } else if(average >=3) {
            JOptionPane.showMessageDialog(null, "Average = " + average + " \n Exam", "Status", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Average = " + average + " \n Withheld", "Status", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
