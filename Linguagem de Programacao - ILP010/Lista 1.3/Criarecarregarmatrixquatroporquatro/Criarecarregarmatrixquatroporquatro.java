package academy.learnprogramming.Criarecarregarmatrixquatroporquatro;

import java.util.Random;

public class Criarecarregarmatrixquatroporquatro {

	public static void main(String args[]) {
		int[][] matriz = new int[4][4];
		Random aleatorio = new Random();
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz.length;j++) {
				if(i==j) {
					matriz[i][j] = (int)Math.pow(4, i);
				}else {
					matriz[i][j] = aleatorio.nextInt(99);
				}
			}
		}

		for(int[] vet : matriz) {
			for(int bla: vet) {
				System.out.print("[" + String.format("%02d", bla) + "]");
			}
			System.out.println();
		}

	}
}