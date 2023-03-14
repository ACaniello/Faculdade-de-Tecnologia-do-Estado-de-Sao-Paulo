
package aula03_02;
import javax.swing.JOptionPane;


public class Aula03_02 {

   
    public static void main(String[] args) {
        produto p;
    
        String marca;
        float valor, valorImp, porc;
        marca = JOptionPane.showInputDialog("Digite a marca do produto");
        valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto"));
        
    p = new produto(marca, valor);
    
    p.imprimeDados();
    porc=Float.parseFloat(
            JOptionPane.showInputDialog("Digite a porcentagem de imposto"));
        valorImp=p.calculaImposto(porc);
        JOptionPane.showMessageDialog(null, "Imposto a pagar: " + valorImp);
    }
    
}
