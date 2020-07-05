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
public class SaborChocolate extends Bolo {
    
    public SaborChocolate() {
        this.setNome("Bolo de Chocolate");
    }

    @Override
    public String getAdicionais() {
        return "Chocolate\n";
    }

    @Override
    public double getValor() {
        return 6;
    }
    
}
