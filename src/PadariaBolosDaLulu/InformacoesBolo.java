/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadariaBolosDaLulu;

/**
 *
 * @author Luiza
 */
public class InformacoesBolo {
 
     public static void InformacoesDoBolo(Bolo b) {

        System.out.println(b.getNome());
        System.out.println("Sabor: " + b.getAdicionais());
        System.out.println("Preço do Bolo:" + b.getValor()+"\n");

    }

    
}
