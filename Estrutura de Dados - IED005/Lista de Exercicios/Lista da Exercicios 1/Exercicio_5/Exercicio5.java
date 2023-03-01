// Crie um programa que pergunte 2 valores ao usuário e imprima o maior.

import java.util.Scanner;

public class Exercicio5 {
    

    public static void main(String[]args){                
        
        Scanner teclado = new Scanner(System.in);
                                 
        System.out.println("Digite o primeiro valor: ");        
        int valor1 = teclado.nextInt();                
        
        System.out.println("Digite o segundo valor: ");        
        int valor2 = teclado.nextInt();               
        
        if( valor1 < valor2){         
            System.out.println("O menor valor é " + valor1);        
        }else{         
            System.out.println("O menor valor é " + valor2);        
        }
        
        if( valor1 > valor2){         
            System.out.println("O maior valor é " + valor1);        
        }else{         
            System.out.println("O maior valor é " + valor2);        
        }                                
          
        
        System.out.println("Digite o segundo valor: ");        
        int valor2 = teclado.nextInt();
       
        if( valor1 < valor2){
            System.out.println("O menor valor é " + valor1);
        }else{
            System.out.println("O menor valor é " + valor2);
        }
    } 
        
    }
