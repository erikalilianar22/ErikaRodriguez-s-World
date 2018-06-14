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
public class perla extends recursos {
    int recolectarperla;
    int comprarperla;
    
    public perla() {
    }

    public perla(int recolectarperla, int comprarperla) {
        this.recolectarperla = recolectarperla;
        this.comprarperla = comprarperla;
    }

    public int getRecolectarperla() {
        return recolectarperla;
    }

    public void setRecolectarperla(int recolectarperla) {
        this.recolectarperla = recolectarperla;
    }

    public int getComprarperla() {
        return comprarperla;
    }

    public void setComprarperla(int comprarperla) {
        this.comprarperla = comprarperla;
    }
    
}
