// Crie um programa que receba o número do mês e imprima o nome desse mês. Exemplo: mês 4: ABRIL

import java.util.Date;
import java.text.SimpleDateFormat;

public class Exercicio2 {
    public static void main(String args[])
    {
        // initialize Date class
        Date date = new Date();
          
        // initialize SimpleDateFormat class
        // it accepts the format of date
        // here it accpets the "MMM" foprmat for month
        SimpleDateFormat month = new SimpleDateFormat("MMM");
          
        //"format" use to format the date in to string
        String currentMonth = month.format(date);
         
  
        System.out.println(currentMonth);
    }
}
