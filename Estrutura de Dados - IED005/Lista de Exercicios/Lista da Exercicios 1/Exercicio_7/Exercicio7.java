import java.util.*;

public class Exercicio7 {
    public static void main(String args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com sua idade: ");

        int idade = sc.nextInt();

        if (idade < 16)
            System.out.println("Você ainda não está habilitado a votar!");
        else if (idade < 18)
            System.out.println("Você tem o direito de votar!");
        else if (idade < 70)
            System.out.println("Você deve votar!");
        else if (idade >= 70)
            System.out.println("Seu voto não é obrigadorio");
    }
}
