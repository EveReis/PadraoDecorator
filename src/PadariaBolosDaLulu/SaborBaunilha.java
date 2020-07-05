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
public class SaborBaunilha extends Bolo {
    
    public SaborBaunilha() {
        this.setNome("Bolo de Baunilha");
    }

    @Override
    public String getAdicionais() {
        return "Baunilha\n";
    }

    @Override
    public double getValor() {
        return 3;
    }
    
}
