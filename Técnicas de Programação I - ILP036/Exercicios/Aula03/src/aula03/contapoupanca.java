package aula03;


import javax.swing.JOptionPane;

public class contapoupanca {
    
    //Atributos
    String agencia;
    String numero;
    float saldo;
    float taxa;
    
    public contapoupanca() {}
    public contapoupanca(String agencia, String numero, float saldo, float taxa){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.taxa = taxa;
    }


// Métodos

void imprimeDados(){
JOptionPane.showMessageDialog(null, "Dados da conta corrente: " + 
                "\nAgência: " + agencia +
                "\nNúmero: " + numero +
                "\nSaldo: " + saldo +
                "\nTaxa: " + taxa);
}

void depositar(float valor) {
    saldo = saldo + valor;
}

float calculaRendimento(){
    float rendimento;
    rendimento = saldo * taxa/100;
    return rendimento;
}
        


}

