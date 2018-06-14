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
public class diamante extends recursos {
    int recolectardiamante;
    int comprardiamante;

    public diamante() {
    }

    public diamante(int recolectardiamante, int comprardiamante) {
        this.recolectardiamante = recolectardiamante;
        this.comprardiamante = comprardiamante;
    }

    public int getRecolectardiamante() {
        return recolectardiamante;
    }

    public void setRecolectardiamante(int recolectardiamante) {
        this.recolectardiamante = recolectardiamante;
    }

    public int getComprardiamante() {
        return comprardiamante;
    }

    public void setComprardiamante(int comprardiamante) {
        this.comprardiamante = comprardiamante;
    }
    
}
