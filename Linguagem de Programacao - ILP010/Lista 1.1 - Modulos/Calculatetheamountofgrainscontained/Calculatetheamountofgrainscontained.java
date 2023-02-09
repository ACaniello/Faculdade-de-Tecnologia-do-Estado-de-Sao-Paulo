/*
39 | Calculatetheamountofgrainscontained | - Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 1 2 3 4 ... 64
Qte: 1 2 4 8 ... N
*/
package academy.learnprogramming.Calculatetheamountofgrainscontained;

public class Calculatetheamountofgrainscontained {

    public static void main(String[] args) {
        for(int i = 0;i<=63;i++) {
            System.out.print((i+1) + "     ");
            System.out.println((int)(Math.pow(2, i)) + " ");
        }
    }
}
