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
public class SaborLaranja extends Bolo {
    
    public SaborLaranja() {
        this.setNome("Bolo de Laranja");
    }

    @Override
    public String getAdicionais() {
        return "Laranja \n";
    }

    @Override
    public double getValor() {
        return 5;
    }
    
}
