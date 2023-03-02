// Imprima a sequência de Fibonacciaté o número 1000. Essa sequência começa com os números 1, 1 e depois disso, os próximos números são a soma dos dois anteriores: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987.

public class Exercicio11 {
    public static void main(String[] args) {

        int tn, t1, t2, fibonacci;
        do {
            tn = Integer.parseInt(JOptionPane.showInputDialog("Inform which term of the Fibonacci sequence you want to know"));
        } while(tn<=0);

        t1 = 1;
        t2 = 1;
        fibonacci = 0;

        if(tn == 1 || tn == 2) {
            fibonacci = 1;
        } else {
            for(int i = 3; i<=tn; i++) {
                fibonacci = t1 + t2;
                t1 = t2;
                t2 = fibonacci;
            }
        }

        JOptionPane.showMessageDialog(null, fibonacci, tn + "º Term", JOptionPane.INFORMATION_MESSAGE);
    }
}
