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
public class PadariaBolosDaLulu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bolo bolo = new SaborChocolate();
        bolo = new CoberturaDeChocolate(bolo);
        bolo = new Morango(bolo);
        InformacoesBolo.InformacoesDoBolo(bolo);
        Bolo bolo2 = new SaborBaunilha();
        bolo2 = new CoberturaDocedeLeite(bolo2);
        bolo2 = new Pessego(bolo2);
        InformacoesBolo.InformacoesDoBolo(bolo2);
        Bolo bolo3 = new SaborLimao();
        bolo3 = new CoberturaDocedeLeite(bolo3);
        bolo3 = new Morango(bolo3);
        InformacoesBolo.InformacoesDoBolo(bolo3);
       
        
        
    }
    
}
