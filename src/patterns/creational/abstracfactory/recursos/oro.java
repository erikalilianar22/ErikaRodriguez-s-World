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
public class oro extends recursos {
    int recolectaroro;
    int compraroro;

    public oro() {
    }

    public oro(int recolectaroro, int compraroro) {
        this.recolectaroro = recolectaroro;
        this.compraroro = compraroro;
    }

    public int getRecolectaroro() {
        return recolectaroro;
    }

    public void setRecolectaroro(int recolectaroro) {
        this.recolectaroro = recolectaroro;
    }

    public int getCompraroro() {
        return compraroro;
    }

    public void setCompraroro(int compraroro) {
        this.compraroro = compraroro;
    }
    
}
