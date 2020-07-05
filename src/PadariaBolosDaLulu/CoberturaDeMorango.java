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
public class CoberturaDeMorango extends Cobertura {
    
     public CoberturaDeMorango(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicionais() {

        return  this.getBolo().getAdicionais() + "Cobertura: Morango \n";
    }

    @Override
    public double getValor() {

        return 2.0 + this.getBolo().getValor();
    }


    
}
