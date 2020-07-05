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

public class SaborLimao extends Bolo {
    
    public SaborLimao() {
        this.setNome("Bolo de Limão");
    }

    @Override
    public String getAdicionais() {
        return "Limão \n";
    }

    @Override
    public double getValor() {
        return 5;
    }
    
}
