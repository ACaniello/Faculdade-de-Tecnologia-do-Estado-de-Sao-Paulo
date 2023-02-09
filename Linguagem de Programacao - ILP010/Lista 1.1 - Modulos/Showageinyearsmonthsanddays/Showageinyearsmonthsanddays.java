/*
30 | Showageinyearsmonthsanddays | - Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
*/
package academy.learnprogramming.Showageinyearsmonthsanddays;

import javax.swing.JOptionPane;

public class Showageinyearsmonthsanddays {

    public static void main(String[] args) {

        int ageYear, ageMonth, ageDay = 0, bissextileYear = 0;

        String birthDate = JOptionPane.showInputDialog("Enter your date of birth (DD/MM/AAAA)");

        int dayOfBirth = Integer.parseInt(birthDate.substring(0,2));
        int monthOfBirth = Integer.parseInt(birthDate.substring(3,5));
        int yearOfBirth = Integer.parseInt(birthDate.substring(6,10));

        String currentDate = JOptionPane.showInputDialog("Enter the current date (DD/MM/AAAA)");
        
        int currentDay = Integer.parseInt(currentDate.substring(0,2));
        int currentMonth = Integer.parseInt(currentDate.substring(3,5));
        int currentYear = Integer.parseInt(currentDate.substring(6,10));

        if(monthOfBirth>currentMonth) {
            ageYear = 0;
        }else {
            ageYear = currentYear - yearOfBirth;
        }
        for(int i = yearOfBirth; yearOfBirth>=currentYear; i++) {
            if((i%4 == 0 && i%100 != 0) || i%400 == 0) {
                bissextileYear++;
            }
        }
        if(monthOfBirth > currentMonth) {
            ageMonth = 12-currentMonth;
        }else if(currentMonth > monthOfBirth) {
            ageMonth = currentMonth - monthOfBirth;
        }else {
            ageMonth = 0;
        }

        if(currentDay  == 29) {
            ageDay = bissextileYear - 1;
        }
        if(monthOfBirth>= 2 && dayOfBirth >= 28) {
            ageDay = bissextileYear;
        }

        switch(monthOfBirth) {
            case 2:
                ageDay += (28+currentDay)-dayOfBirth;
                break;
            case 4:case 6: case 9: case 11:
                ageDay += (30+currentDay)-dayOfBirth;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                ageDay += (31+currentDay)-dayOfBirth;
                break;
        }
        String day = ageDay <2 ? "day" : "days";
        String month = ageMonth <2 ? "month" : "months";
        String year = ageYear <2 ? "year" : "years";
        JOptionPane.showMessageDialog(null, "Your age is " + ageYear + " " + year + " " + ageMonth + " " + month + " and " + ageDay + " " + day + ".");
    }
}
