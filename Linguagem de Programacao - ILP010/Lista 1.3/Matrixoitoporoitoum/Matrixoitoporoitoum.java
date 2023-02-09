package academy.learnprogramming.Matrixoitoporoitoum;

public class Matrixoitoporoitoum {

	public static void main(String args[]) {
		int[][] matriz = new int[8][8];

		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz.length;j++) {
				if(i==0) {
					matriz[i][j] = (int)Math.pow(j+1, i+1);
				}else {
					matriz[i][j] = (int)Math.pow(i+1, j);
				}
			}
		}

		for(int[] vet : matriz) {
			for(int i : vet) {
				System.out.print(" " + String.format("%7d", i) + " ");
			}
			System.out.println();
		}
	}
}