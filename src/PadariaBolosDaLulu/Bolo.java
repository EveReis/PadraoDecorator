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


public abstract class Bolo {
    
    private String nome;
    
    public abstract String getAdicionais();
    public abstract double getValor();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
   
}