/*
17 - Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/
package academy.learnprogramming.Amountoflitersspent;

import javax.swing.JOptionPane;

public class Amountoflitersspent 
/*
{
    public static void main (String[] args){
        int time, averageSpeed, efficiency;
        double distance, spentLiters;

        efficiency = 12;
        time = Integer.parseInt(JOptionPane.showInputDialog("Enter travel time in hours"));
        averageSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter the avarege speed in KM/h"));
        distance = time*averageSpeed;
        spentLiters = distance/efficiency;

        JOptionPane.showMessageDialog(null,
                "Moving by " + time + "hours in " + averageSpeed + "average KM/h," +
                        "you moved " + distance + "Km. \n" +
                        "With an expense of " + efficiency + "liters per KM you spent " + spentLiters + " liters.");
    }
} 
*/
    {

	static int tempo, velocidadeMedia, eficiencia;
	static double distancia,litrosGastos;

	public static void main(String[] args) {
		coletarInformacoes();
		calcular();
		mensagem();
	}
	
	public static void coletarInformacoes() {
		eficiencia = 12;
		tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de viagem em horas"));
		velocidadeMedia = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade m�dia em KM/h"));		
	}
	public static void calcular() {
		distancia = tempo*velocidadeMedia;
		litrosGastos = distancia/eficiencia;
	}
	
	public static void mensagem() {
		JOptionPane.showMessageDialog(null, "Se movendo por " + tempo + " horas em " + velocidadeMedia + "Km/h em média, "
		+ "você percorreu " + distancia + "Km. \n"
		+ "Com um gasto de " + eficiencia + "L por Km você gastou " + String.format("%.2f", litrosGastos) + " litros.");
		
		}

}
