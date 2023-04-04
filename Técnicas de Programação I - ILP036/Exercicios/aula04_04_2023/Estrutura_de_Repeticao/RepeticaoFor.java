package aula04_04_2023.Estrutura_de_Repeticao;

import java.util.Scanner;

public class RepeticaoFor {
    public static void main(String[] args){
        
        Scanner leitura = new Scanner(System.in);
        int soma = 0, cont, A;
        for (cont=0; cont<2; cont++){
            
            A = leitura.nextInt();
            
            soma += A;
        }
        System.out.println("A média é: " + (soma/cont));
    }
}
