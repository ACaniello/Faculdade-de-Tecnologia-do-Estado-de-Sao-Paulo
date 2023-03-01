package exemplo_01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exemplo_01 {
    public static void main(String[] args) {
    String texto_1, texto_2;
    int valor_1, valor_2;
    float moeda_1, moeda_2;    
        System.out.println("Vamos fazer a entrada dos dados pelo modo console");        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um texto:");
        texto_1 = entrada.nextLine();
        System.out.println("Digite um número inteiro:");
        valor_1 = entrada.nextInt();
        System.out.println("Digite um valor monetário:");
        moeda_1 = entrada.nextFloat();
        System.out.println("valores digitados texto:" + texto_1 + " valor: " +  valor_1 + " valor moeda: " +moeda_1);         
        
        texto_2 = JOptionPane.showInputDialog("Favor Digitar um texto");
        valor_2 = Integer.parseInt(JOptionPane.showInputDialog("Favor Digitar um texto"));
        moeda_2 = Float.parseFloat(JOptionPane.showInputDialog("Favor Digitar um texto"));        
    }    
}
