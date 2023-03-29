
package boletim;

import javax.swing.JOptionPane;

public class teste_boletim {
    
    public static void main(String[] args){
        //Boletim aluno1 = new Boletim(5.6,4.5);
         Boletim aluno1 = new Boletim();
        aluno1.n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        aluno1.n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
        aluno1.imprimeBoletim();
    }
    
   
}
