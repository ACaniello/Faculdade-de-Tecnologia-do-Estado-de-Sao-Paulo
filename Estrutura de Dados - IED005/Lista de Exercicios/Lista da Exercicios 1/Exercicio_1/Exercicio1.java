// Crie um programa que pergunte 3 valores ao usuário e imprima a soma desses valores. Dica: usar uma variável para a soma. java

import javax.swing.JOptionPane;
 
public class Exercicio1 {
 
    public static void main(String args[]) {
     
     int soma;
     int num1 = 0;
     int num2 = 0;
     int num3 = 0;
     
     num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número:"));
     
     num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número:"));

     num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o terceiro número:"));
     
     soma =  num1 + num2 + num3; 
    
     JOptionPane.showMessageDialog(null,"A soma dos numeros e: " + soma);

        }
    }