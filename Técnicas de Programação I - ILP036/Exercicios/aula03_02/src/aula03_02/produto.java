
package aula03_02;
import javax.swing.JOptionPane;

public class produto {
    
    //Atributos
    
    String marca;
    float valor;
    
    //Construtores
    public produto(){}


    public produto (String marca, float valor) {
        this.marca = marca;
        this.valor = valor;
}

void imprimeDados(){
    JOptionPane.showMessageDialog(null, "Dados do Produto: " +
        "\nMarca: " + marca +
        "\nValor: " + valor);
}

float calculaImposto(float p){
    return valor*p/100;
    }

}