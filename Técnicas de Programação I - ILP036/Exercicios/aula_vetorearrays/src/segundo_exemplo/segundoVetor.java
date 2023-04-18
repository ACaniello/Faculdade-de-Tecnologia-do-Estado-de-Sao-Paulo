package segundo_exemplo;

import javax.swing.JOptionPane;

public class segundoVetor {
    public static void main(String[] args) {
        float[] nota = new float[40];
        String[] nome = new String[40];
        float soma = 0, media;
        
        for(int i=0; i < 40; i++){
            nome[i] = JOptionPane.showInputDialog(null, "Digite o nome do " + (i+i) + " aluno");
            
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite  nota de aluno " + nome[i]));
            
            soma += nota[i];
         }
        media = soma / 40;
        for(int i=0; i < 40; i++){
            if(nota[i] > media)
                System.out.println("Parabéns " + nome[i]);
        }
        }
}
