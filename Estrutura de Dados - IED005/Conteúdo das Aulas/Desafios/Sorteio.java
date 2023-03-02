import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        int i = 0;
        int l = 0;

        Random r = new Random();
        int valor = 0;
        int intsorteados[] = new int[100];

        while (i < intsorteados.length){
            boolean boolverifica = false;
            valor = r.nextInt(100);

            for (l = 0;l < intsorteados.length; l++){
                if (intsorteados[l] == valor){
                    boolverifica = true;
                    break;
                }
            }

            if (!boolverifica) {
                intsorteados[i] = valor;
                System.out.print(intsorteados[i] + " ");

            }
            i++;
        }
    }
}
