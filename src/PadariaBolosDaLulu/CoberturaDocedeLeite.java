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
public class CoberturaDocedeLeite extends Cobertura {
    
     public CoberturaDocedeLeite(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicionais() {

        return  this.getBolo().getAdicionais() + "Cobertura: Doce de Leite \n";
    }

    @Override
    public double getValor() {

        return 1.5 + this.getBolo().getValor();
    }
}
