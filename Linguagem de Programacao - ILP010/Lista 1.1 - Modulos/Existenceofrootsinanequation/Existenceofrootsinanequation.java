/*
20 - Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
*/
package academy.learnprogramming.Existenceofrootsinanequation;

import javax.swing.JOptionPane;
/* import java.util.Scanner; */


public class Existenceofrootsinanequation 
/*
{

    public static void main(String[] args){

        int a, b, c;
        double delta, root1, root2;

        a = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of C"));
        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta == 0){
            root1 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println(root1);
            JOptionPane.showMessageDialog(null, "The equation has equal roots: " + root1 + ".",
                    "Delta equal zero", JOptionPane.INFORMATION_MESSAGE);
            }else {
            root1 = (-b + Math.sqrt(delta))/(2*a);
            root2 = (-b - Math.sqrt(delta))/(2*a);
            JOptionPane.showMessageDialog(null, "The equation has 2 roots: " + root1 + " and " + root2 + ".",
                    "Delta greater than zero", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
*/

/*
public class Existenceofrootsinanequation {

    public static void main (String[] args) {

        float a, b, c, delta, sqrtdelta, root1, root2;
        Scanner entrance = new Scanner(System.in);
    }
        System.out.println("Equation AX^2+BX+C = 0");
        System.out.print("Enter the value of A: ");
        a = entrance.nextFloat();
        System.out.println("Enter the value of B: ");
        b = entrance.nextFloat();
        System.out.println("Enter the value of C: ");
        c = entrance.nextFloat();

        if (a != 0) {
            delta = (b*b) - (4*a*c);
            sqrtdelta = (float)Math.sqrt(delta);
        if (delta >= 0)
            root1 = ((-1)*b + sqrtdelta)/(2*a);
            root2 = ((-1)*b - sqrtdelta)/(2*a);
            System.out.printf("Roots: %.2f and %.2f", root1, root2);
    } else {
            delta = -delta;
            sqrtdelta = (float)Math.sqrt(delta);
            System.out.printf("Root 1: %.2f + 1.@.2f\n", (-b)/(2*a), (sqrtdelta)/2(2*a));
            System.out.printf("Root 1: %.2f + 1.@.2f\n", (+b)/(2*a), (sqrtdelta)/2(2*a));
    } else {
            System.out.println("Invalid A coefficient, entry to the invalid equation");
    }
}
 */
    
     {

	static int a, b, c;
	static double delta, raiz1, raiz2;
	public static void main(String[] args) {
		capturarInformacoes();
		calcular();
		menssagem();
	}
	static void capturarInformacoes(){
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de C"));
		delta = Math.pow(b, 2) - 4 * a * c;
	}

	
	static void calcular(){
		if(delta == 0) {
			raiz1 = (-b + Math.sqrt(delta))/(2*a);
			System.out.println(raiz1);
			JOptionPane.showMessageDialog(null, "A equação possui raizes iguais: " + raiz1 + ".", 
					"Delta Igual 0", JOptionPane.INFORMATION_MESSAGE);
		}else if(delta<0) {
			JOptionPane.showMessageDialog(null, "A equação não possui raizes reais",
					"Delta menor que 0", JOptionPane.INFORMATION_MESSAGE);
		}else {
			raiz1 = (-b + Math.sqrt(delta))/(2*a);
			raiz2 = (-b - Math.sqrt(delta))/(2*a);
		}
	}
	
	static void menssagem(){
		JOptionPane.showMessageDialog(null, "A equação possui 2 raizes: " + raiz1 + " e " + raiz2 + ".",
				"Delta maior que 0", JOptionPane.INFORMATION_MESSAGE);
	}
}
