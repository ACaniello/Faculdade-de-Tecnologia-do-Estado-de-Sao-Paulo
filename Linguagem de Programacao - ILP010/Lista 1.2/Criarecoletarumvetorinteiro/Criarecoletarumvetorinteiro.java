package academy.learnprogramming.Criarecoletarumvetorinteiro;

import javax.swing.JOptionPane;

public class Criarecoletarumvetorinteiro {
	public static void main(String args[]) {
		int[] vetor = new int[20];

		carregarVetor(vetor);
		mostrarVetor(vetor);
		JOptionPane.showMessageDialog(null, "A somatória ¹°∑ (A[1] – A[21–1]) é: " + somar(vetor), "SOMATORIA", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void carregarVetor(int vet[]) {
		for(int i = 0; i < vet.length; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número Inteiro"));
		}
		JOptionPane.showMessageDialog(null, "Vetor Carregado", "DONE", JOptionPane.INFORMATION_MESSAGE);
	}

	static void mostrarVetor(int vet[]) {
		for(int i : vet) {
			System.out.println(i);
		}
	}


	public static int somar(int vet[]) {
		int result = 0;
		for(int i = 0; i < (vet.length/2); i++) {
			result += vet[i] - vet[vet.length-(i+1)];
		}
		return result;
	}
}
