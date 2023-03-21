
package boletim;

import javax.swing.JOptionPane;


public class Boletim {

    double n1;
    double n2;
    double media;
    
    public Boletim(){
        
    }
    public Boletim(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    void imprimeBoletim(){
        calculaMedia();
        JOptionPane.showMessageDialog(null, "Dados do Boletim: " + 
                "\nNota 1: " + n1 +
                "\nNota 2: " + n2 +
                "\nMedia: " + media +
                "\nConteito: " + verificaConceito());
    }
    
    void calculaMedia(){
        media = (n1+n2)/2;
    }
    
    String verificaConceito(){
        String conceito="";
        if (media >= 8 && media <= 10)
            conceito="A";
        else if (media >= 6)
            conceito="B";
        else if (media >=4)
            conceito="C";
        else
            conceito="D";
        return conceito;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
