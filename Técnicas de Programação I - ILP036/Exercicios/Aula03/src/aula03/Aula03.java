package aula03;
import javax.swing.JOptionPane;

public class Aula03 {

    
    public static void main(String[] args) {
        
        //Criando o objeto
        contapoupanca cp;
        
        //Criar variáveis de apoio
        float valorDep, rendimento, saldo, taxa;
        String agencia, numero;
        
        agencia = JOptionPane.showInputDialog("Digite o número da agência");
        numero = JOptionPane.showInputDialog("Digite o número da Conta Poupança");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo"));
        taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de juros"));
        
        cp = new contapoupanca(agencia, numero, saldo, taxa);
        
        //Utilização dos métodos para o objeto do tipo Conta Poupança
        
        cp.imprimeDados();
        rendimento = cp.calculaRendimento();
        JOptionPane.showMessageDialog(null, "O rendimento é: " + rendimento);
        valorDep = Float.parseFloat(
            JOptionPane.showInputDialog("Digite o valor a ser depositado"));
        cp.depositar(valorDep);
        cp.imprimeDados();
    }
    
}
