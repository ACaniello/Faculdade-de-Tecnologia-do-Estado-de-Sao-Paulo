package altura;

//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
//a. a maior e a menor altura do grupo;
//b. média de altura dos homens;
//c. o número de mulheres.

import java.util.Scanner;
public class altura {
    public static void main(String[] args) {
        int sexo, quantidadeMulheres=0, quantidadeHomens=0;
        float altura, somaH=0, mediaHomens=0, maior=0, menor=0;

                Scanner entrada = new Scanner(System.in);

                for (int i=0; i<10; i++) {
                    System.out.print("Escolha o sexo da pessoa (1 - Mulher, 2 - Homem): ");
                    sexo = entrada.nextInt();
                    System.out.print("Digite a altura: ");
                    altura = entrada.nextFloat();

                    if (sexo == 1){
                        quantidadeMulheres++;
                    } else if (sexo == 2) {
                        quantidadeHomens++;
                        somaH = somaH + altura;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    if (altura > maior) {
                        maior = altura;
                    } else if (altura < menor) {
                        menor = altura;
                    }
                }

                mediaHomens = somaH + quantidadeHomens;

                System.out.println("A maior altura do grupo é de " + maior + "m, é a menor é de " + menor + " m");
                System.out.println("A média de altura dos homens é " + mediaHomens + " m");
                System.out.println("O número de mulheres é " + quantidadeMulheres);

                entrada.close();
    }
}
