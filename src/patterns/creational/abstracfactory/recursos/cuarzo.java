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
public class cuarzo extends recursos {
    int recolectarcuarzo;
    int comprarcuarzo;

    public cuarzo() {
    }

    public cuarzo(int recolectarcuarzo, int comprarcuarzo) {
        this.recolectarcuarzo = recolectarcuarzo;
        this.comprarcuarzo = comprarcuarzo;
    }

    public int getRecolectarcuarzo() {
        return recolectarcuarzo;
    }

    public void setRecolectarcuarzo(int recolectarcuarzo) {
        this.recolectarcuarzo = recolectarcuarzo;
    }

    public int getComprarcuarzo() {
        return comprarcuarzo;
    }

    public void setComprarcuarzo(int comprarcuarco) {
        this.comprarcuarzo = comprarcuarco;
    }
    
    
}
