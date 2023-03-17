/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Carro {
    public Motor m = new Motor();
    public Roda r = new Roda();
    public void ligar() {
        System.out.println("Ligando");
        m.ligar();
}
}
