// Imprima os valores inteiros entre 10 a 100.

import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {

        //instância um objeto da classe Random usando o construtor básico
        Random gerador = new Random();
        
        //imprime sequência de 10 números inteiros aleatórios entre 0 e 25
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(100));
         }
    }
}


//public class Exercicio1 {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i <= 100){
//            System.out.println(i);
//            i++;
//        }
//    }
//}