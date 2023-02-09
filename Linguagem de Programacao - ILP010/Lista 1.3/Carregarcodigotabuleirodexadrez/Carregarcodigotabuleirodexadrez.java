package academy.learnprogramming.Carregarcodigotabuleirodexadrez;

import java.util.Random;
import javax.swing.JOptionPane;

public class Carregarcodigotabuleirodexadrez {

	public static void main(String args[]) {
		int[][] tabuleiro = new int[8][8];
		int[] pontos = new int[8];
		Random aleatorio = new Random();
		String menssagem = "";

		for(int i = 0;i<tabuleiro.length;i++) {
			for(int j = 0;j<tabuleiro.length;j++) {
				tabuleiro[i][j] = aleatorio.nextInt(7)+1;
			}
		}
		for(int[] vet : tabuleiro) {
			for(int montar : vet) {
				System.out.print(" " + montar + " ");
			}
			System.out.println();
		}

		for(int i = 0;i<tabuleiro.length;i++) {
			for(int j = 0;j<tabuleiro.length;j++) {
				pontos[tabuleiro[i][j]]++;
			}
		}
		for(int i = 0;i<pontos.length;i++) {
			menssagem += " " + pontos[i];
			pontos[0] += pontos[i];
		}

		JOptionPane.showMessageDialog(null, "A soma dos pontos das peças é " + pontos[0], menssagem, JOptionPane.INFORMATION_MESSAGE);
	}
}