package primeiro_exemplo;

public class primeiroVetor {
    public static void main(String[] args){
        final int TAMANHO = 30;
        int vetorNumeros[] = new int [TAMANHO];
        
        for (int indice = 0; indice < TAMANHO; indice++){
            vetorNumeros[indice] = indice + 10;
            
            if (vetorNumeros[indice]%2 == 0) {
                switch (vetorNumeros[indice]) {
                    case 20:
                        System.out.print("Vinte");
                        break;
                    case 30:
                        System.out.print("Trinta");
                        break;
                    default:
                        System.out.print(vetorNumeros[indice] + " ");
                        break;
                }
            }
        }
        
    }
}
