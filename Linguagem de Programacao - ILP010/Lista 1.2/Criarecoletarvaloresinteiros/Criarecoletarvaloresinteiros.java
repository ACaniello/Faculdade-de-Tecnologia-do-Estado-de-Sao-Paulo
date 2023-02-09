package academy.learnprogramming.Criarecoletarvaloresinteiros;

import javax.swing.JOptionPane;
public class Criarecoletarvaloresinteiros {

	public static void main(String argas[]) {
		int vet1[] = new int[3];
		int vet2[] = new int[3];
		int vet3[] = new int[6];

		for(int i=0; i<vet1.length;i++) {
			vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número Inteiro"));
			vet3[i] = vet1[i];
		}
		for(int i=0; i<vet2.length;i++) {
			vet2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número Inteiro"));
			vet3[i+3] = vet2[i];
		}

		for (int i : vet3) {
			System.out.println(i);
		}
	}

}