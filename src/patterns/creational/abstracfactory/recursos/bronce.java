/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstracfactory.recursos;

/**
 *
 * @author erikav
 */
public class bronce extends recursos{
    int recolectarbronce;//sumar cuando pasen las fases
    int comprarbronce;// restar cuando se compren cosas

    bronce() {
    }

    public bronce(int recolectarbronce, int comprarbronce) {
        this.recolectarbronce = recolectarbronce;
        this.comprarbronce = comprarbronce;
    }

    public int getRecolectarbronce() {
        return recolectarbronce;
    }

    public void setRecolectarbronce(int recolectarbronce) {
        this.recolectarbronce = recolectarbronce;
    }

    public int getComprarbronce() {
        return comprarbronce;
    }

    public void setComprarbronce(int comprarbronce) {
        this.comprarbronce = comprarbronce;
    }
    
    

    
}
