/**
 * Desenvolva um programa na linguagem java, que receba a média da temperatura diária durante um período de 7 dias (armazene as informações em um vetor),
 * calcule a média da temperatura desse período (semanal) e informe quantos dias a temperatura  ficou acima da média e quantos ficou abaixo da média semanal.
 */

package exercicioTemperatura;

import java.util.Scanner;

public class temperatura_Clima {
    public static void main(String[] args) {
        double[] temperaturas; //Temperatura dos dias previstos.

        double maiorTemperatura = 0;
        double menorTemperatura = 999999;
        double somaDasTemperaturas = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias");
        temperaturas = new double[scan.nextInt()]; // Tamanho do arrey temperaturas.

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Digite a temperatura do " + (i + 1) + "° dia");
            temperaturas[i] = scan.nextDouble();
            somaDasTemperaturas += temperaturas[i];
        }

        double mediaDasTemperaturas = somaDasTemperaturas / temperaturas.length;
        int diasQueATemperaturaFoiMenor = 0;

        for (int i = 0; i < temperaturas.length; i++) {

            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
            else if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
            if (temperaturas[i] < mediaDasTemperaturas) {
                diasQueATemperaturaFoiMenor++;
            }
        }
        System.out.println("A maior temperatura foi: "+ maiorTemperatura + "°C");
        System.out.println("A menor temperatura foi: "+ menorTemperatura +"°C");
        System.out.printf("A temperatura média foi: %.2f", mediaDasTemperaturas , "°C\n");
        System.out.println(diasQueATemperaturaFoiMenor + " dias se passaram com a temperatura abaixo da média.");

    }
}
