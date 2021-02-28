/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo7.SecretPhrase;

/**
 *
 * @author Citlalli
 */
public class SecretPhrase {
    private String frase;
    private StringBuilder descrubir;

    public SecretPhrase(String frase) {
        this.frase = frase;
        this.descrubir = new StringBuilder(this.frase);
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void descubir(int n, char x){
        this.descrubir.setCharAt(n,x);
        this.frase = descrubir.toString();
    }

    public void encontrar(){
        
    }
}
