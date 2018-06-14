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
public class madera extends recursos {
    int recolectarmadera;
    int comprarmadera;

    public madera() {
    }

    public madera(int recolectarmadera, int comprarmadera) {
        this.recolectarmadera = recolectarmadera;
        this.comprarmadera = comprarmadera;
    }

    public int getRecolectarmadera() {
        return recolectarmadera;
    }

    public void setRecolectarmadera(int recolectarmadera) {
        this.recolectarmadera = recolectarmadera;
    }

    public int getComprarmadera() {
        return comprarmadera;
    }

    public void setComprarmadera(int comprarmadera) {
        this.comprarmadera = comprarmadera;
    }
    
}
