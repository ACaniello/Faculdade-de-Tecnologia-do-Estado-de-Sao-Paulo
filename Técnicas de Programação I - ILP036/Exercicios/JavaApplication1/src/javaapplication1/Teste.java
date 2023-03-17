/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        float x = 3.14f;
        String t = "Texto";
        
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = c2;
           
        c1.m.potencia = 500;
        //Carro c3 = c1;
        System.out.println(c3.m.potencia);
        
        c1.m.potencia = 200;
        System.out.println(c1.m.potencia);
    }
    
}
