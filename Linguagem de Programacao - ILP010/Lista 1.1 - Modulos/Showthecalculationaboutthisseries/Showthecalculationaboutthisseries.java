/*
42 - Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
*/
package academy.learnprogramming.Showthecalculationaboutthisseries;

import javax.swing.JOptionPane;

public class Showthecalculationaboutthisseries 

/*
{
    public static void main(String[] args) {

        double n = 50, r;

        r = 0;

        for(double i = 1;i<=n;i++) {
            r +=(i / (i + (i-1)));
            System.out.println(i + "/(" + i + "+(" + (i-1) + ")");
        }
        JOptionPane.showMessageDialog(null, r, "1/1+1/2+...+1/N", JOptionPane.INFORMATION_MESSAGE);

    }
}
*/
    {
	public static void main(String[] args) {
		double n;
		n = 50;
		JOptionPane.showMessageDialog(null, s(n), "1/1+1/2+...+1/N", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public static double s(double n) {
		if(n==1) {
			System.out.println(n);
			return n;
		}else {
			System.out.println(n + "/(" + n + "+(" + (n-1) + ")");
			return n/(n+(n-1)) + s(n-1);
		}
	}
}
