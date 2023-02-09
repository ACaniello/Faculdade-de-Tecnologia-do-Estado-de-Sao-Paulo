/*
28 - Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal         Preço Atual         Preço Novo
< 500           <         30        +        10%
>= 500 e < 1000 >=        30 e < 80 +        15%
>= 1000         >=        80        -         5%
Obs.: para outras condições, preço novo será igual ao preço atual.
*/

package academy.learnprogramming.Getcurrentpriceandshownewprice;

import javax.swing.JOptionPane;

public class Getcurrentpriceandshownewprice 

/*
{
    public static void main(String[] args) {

        double currentPrice, monthlySale, newPrice;

        currentPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter current price"));
        monthlySale = Double.parseDouble(JOptionPane.showInputDialog("Report the average monthly sale"));

        if(monthlySale<500 && currentPrice<30) {
            newPrice = currentPrice + (currentPrice*0.1);
        } else if(monthlySale>=500 && monthlySale<1000 && currentPrice>=30 && currentPrice<80) {
            newPrice = currentPrice + (currentPrice * 0.15);
        } else if(monthlySale>=1000 && currentPrice>=80) {
            newPrice = currentPrice - (currentPrice * 0.05);
        } else {
            newPrice = currentPrice;
        }

        JOptionPane.showMessageDialog(null, "Average sales for the month were: " + monthlySale + "\n"
                + "The current price is: " + currentPrice + "\n"
                + "The new price will be: " + newPrice, "New Price", JOptionPane.INFORMATION_MESSAGE);
    }
}
*/
    {

	static double precoAtual, vendaMensal, novoPreco;
	public static void main(String[] args) {
		coletarInformacao();
		comparar();
		exibir();
		}
	
	static void coletarInformacao() {
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual"));
		vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe a venda média mensal"));
	}
	
	static void comparar() {
		if(vendaMensal<500 && precoAtual<30) {
			novoPreco = precoAtual + (precoAtual*0.1);
		}else if(vendaMensal>=500 && vendaMensal<1000 && precoAtual>=30 && precoAtual<80) {
			novoPreco = precoAtual + (precoAtual * 0.15);
		}else if(vendaMensal>=1000 && precoAtual>=80) {
			novoPreco = precoAtual - (precoAtual * 0.05);
		}else {
			novoPreco = precoAtual;
		}
	}
	
	
	static void exibir() {
		JOptionPane.showMessageDialog(null, "A média das vendas do mês foi: " + vendaMensal + "\n"
				+ "O preço atual é: " + precoAtual + "\n"
				+ "O novo preço será: " + novoPreco, "Novos Preços", JOptionPane.INFORMATION_MESSAGE);
	}
}
