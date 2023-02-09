package academy.learnprogramming.Matrixoitoporoitodois;

public class Matrixoitoporoitodois {

	public static void main(String args[]) {
		int[][] mat = new int[8][8];

		for(int z = 1; z<=4; z++) {
			for(int x = z-1;x<=(8-z);x++) {
				for(int y = z-1;y<=(8-z);y++) {
					mat[x][y] = z;
				}
			}
		}

		for(int[] vet: mat) {
			for(int bla : vet) {
				System.out.print(" " + bla + " ");
			}
			System.out.println();
		}
	}
}