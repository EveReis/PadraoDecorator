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
public class CoberturaDeChocolate extends Cobertura {
    
     public CoberturaDeChocolate(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicionais() {

        return  this.getBolo().getAdicionais() + "Cobertura: Chocolate \n";
    }

    @Override
    public double getValor() {

        return 2.25 + this.getBolo().getValor();
    }
    
}
