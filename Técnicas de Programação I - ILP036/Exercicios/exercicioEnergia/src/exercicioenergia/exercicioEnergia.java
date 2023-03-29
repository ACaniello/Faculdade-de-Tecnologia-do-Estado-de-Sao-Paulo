package exercicioenergia;

import javax.swing.JOptionPane;


public class exercicioEnergia {

    public static void main(String[] args) {
    
        double consumo;
        double fornecimento;
        double icms;
        double cofins;
        double pispasesp;
        double icmscofins;
        double icmspasep;
        double fatura;
        
        consumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o consumo: "));
                
                // fornecimento
                
        fornecimento = consumo * 0.28172;
        
        if (consumo <= 200){
            // Calcular valores
            icms = fornecimento * 0.136363;
            cofins = fornecimento * 0.0614722;
            pispasesp = fornecimento * 0.013346;
            icmscofins = cofins * 0.136363; 
            icmspasep = pispasesp * 0.136363;
            fatura = fornecimento+icms+cofins+pispasesp+icmscofins+icmspasep;
        } else {
            // Calcular valores
            icms = fornecimento * 0.333333;
            cofins = fornecimento * 0.0730751;
            pispasesp = fornecimento * 0.0158651;
            icmscofins = cofins * 0.333333; 
            icmspasep = pispasesp * 0.333333;
            fatura = fornecimento+icms+cofins+pispasesp+icmscofins+icmspasep;
        }        
            
        //fatura = fornecimento+icms+cofins+pispasesp+icmscofins+icmspasep;
            
        JOptionPane.showMessageDialog(null, "A sua fatura é: " + 
                "\nFornecimento: " + fornecimento +
                "\nICMS: " + icms +
                "\nCOFINS: " + cofins +
                "\nPIS/PASESP: " + pispasesp +
                "\nICMS sobre COFINS: " + icmscofins + 
                "\nICMS sobre PIS/PASESP: " + icmspasep +
                "\nFATURA: " + fatura);
    
    }
}
