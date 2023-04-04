package aula04_04_2023.Estrutura_de_Repeticao;

import java.util.Scanner;

public class RepeticaoDoWhile {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        float A, soma = 0;
        String resp;
        int cont = 0;
        do {
            System.out.println("Deseja continuar (S ou N)?");
            resp = leitura.next();
        }
        while (resp.equalsIgnoreCase("s"));
        System.out.println("A média é: " + (soma/cont));
    }
}
