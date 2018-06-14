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
public class plata extends recursos {
    int recolectarplata;
    int comparplata;

    public plata() {
    }

    public plata(int recolectarplata, int comparplata) {
        this.recolectarplata = recolectarplata;
        this.comparplata = comparplata;
    }

    public int getRecolectarplata() {
        return recolectarplata;
    }

    public void setRecolectarplata(int recolectarplata) {
        this.recolectarplata = recolectarplata;
    }

    public int getComparplata() {
        return comparplata;
    }

    public void setComparplata(int comparplata) {
        this.comparplata = comparplata;
    }
    
    

}
