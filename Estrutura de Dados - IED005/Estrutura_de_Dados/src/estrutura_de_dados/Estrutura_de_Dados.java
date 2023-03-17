
package estrutura_de_dados;

// --------------------------------------------------

// --------------------------------------------------

// Exercicio 1 - Pilha: Aprendendo exercícios de pilha

/*
public class Estrutura_de_Dados {

    public Object[] pilha;
    public int posicaoPilha;

    public Estrutura_de_Dados () {
        this.posicaoPilha = -1;
// indica que esta nula, vazia, pois posição um indica que contém informação
        this.pilha = new Object[1000];
// criando uma pilha com 1000 posições
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {
        // push
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public static void main(String args[]) {
        Estrutura_de_Dados p = new Estrutura_de_Dados();
        p.empilhar("Portuguesa ");
        p.empilhar("Frango com catupiry ");
        p.empilhar("Calabresa ");
        p.empilhar("Quatro queijos ");
        p.empilhar("Margherita");
                while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
}*/


// --------------------------------------------------

// --------------------------------------------------

// Exercicio 2: Crie um método multiplicação sem usar multiplicação e nem divisão

/*public class Estrutura_de_Dados {
   
    
        public static void main(String args[]) {
            
            double resultado = multiplicacao(4, 2);
            System.out.println(resultado);
        
        }
            
             static double multiplicacao (int n1, int n2){
            for (int i=1;i<=n2;i++){
            double resultado = n1;

            
            resultado = (n1+n1);
            return resultado;
            
            }
        }*/

//--------------------------------------

//--------------------------------------

public class Estrutura_de_Dados {
   
    
        public static void main(String args[]) {
            
            double resultado = multiplicacao(4, 2);
            System.out.println(resultado);
        
        }
            
             static double multiplicacao (int n1, int n2){
            for (int i=1;i<=n2;i++){
            double resultado = n1;

            
            resultado = (n1+n1);
            return resultado;
            
            }