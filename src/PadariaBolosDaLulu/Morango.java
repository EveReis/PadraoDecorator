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
public class Morango extends Fruta {
    
    public Morango(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicionais() {

        return this.getBolo().getAdicionais() + "Fruta adicional: Morango \n" ;
    }

    @Override
    public double getValor() {
        return 2.5 + this.getBolo().getValor();
    }
    
}
