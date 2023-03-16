/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhadinamica;

public class Pilha {
    int tamanho;
    No topo;
    
    Pilha () {
        tamanho = 0;
        topo = null; 
    }
    
    boolean estaVazia() {
      //return tamanho == 0;
        if(tamanho == 0)
            return true;
        else
            return false;
    }
        
}
