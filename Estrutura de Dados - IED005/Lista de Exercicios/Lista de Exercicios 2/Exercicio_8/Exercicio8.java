import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vetor[] = new int[5];
        int i = 0, numerosMenores = 0;
        do{
            System.out.println("Informe um valor");
            vetor[i] = in.nextInt();
            i++;
        }while (i < 5);

        for (i = 0; i < vetor.length; i++){
            if (vetor[i] < 0){
                numerosMenores++;
            }
        }
        System.out.println(numerosMenores + " numeros são negativos");
    }
}