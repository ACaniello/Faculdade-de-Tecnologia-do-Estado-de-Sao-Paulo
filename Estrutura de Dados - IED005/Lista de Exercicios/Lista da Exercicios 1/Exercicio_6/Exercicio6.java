// Crie um programa que pergunte 3 valores ao usuário e imprima quantos desses valores são negativos.
// Dica: usar uma variável para contas quantos valores negativos há.
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[]args){
		int valor, positivos = 0, negativos = 0;
        
		System.out.println("Digite o primeiro valor: ");
		valor = STDIN_SCANNER.nextInt();

		if(valor < 0){
			negativos++; // sinônimo de -> negativos += 1; negativos = negativos + 1;
		} else{
			positivos++;
		}

		System.out.println("Digite o segundo valor: ");
		valor = STDIN_SCANNER.nextInt();

		if(valor < 0){
			negativos++;
		} else{
			positivos++;
		}

		System.out.println("Digite o terceiro valor: ");
		valor = STDIN_SCANNER.nextInt();

		if(valor < 0){
			negativos++;
		} else{
			positivos++;
		}

		System.out.println("Digite o quarto valor: ");
		valor = STDIN_SCANNER.nextInt();

		if(valor < 0){
			negativos++;
		} else{
			positivos++;
		}

		System.out.println("Digite o quinto valor: ");
		valor = STDIN_SCANNER.nextInt();

		if(valor < 0){
			negativos++;
		} else{
			positivos++;
		}

		System.out.println("\nPositivos: " + positivos + "\nNegativos: " + negativos);
	}
}
