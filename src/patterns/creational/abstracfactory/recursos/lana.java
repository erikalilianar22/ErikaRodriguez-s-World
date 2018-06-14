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
public class lana extends recursos {
    int recolectarlana;
    int comprarlana;

    public lana() {
    }

    public lana(int recolectarlana, int comprarlana) {
        this.recolectarlana = recolectarlana;
        this.comprarlana = comprarlana;
    }

    public int getRecolectarlana() {
        return recolectarlana;
    }

    public void setRecolectarlana(int recolectarlana) {
        this.recolectarlana = recolectarlana;
    }

    public int getComprarlana() {
        return comprarlana;
    }

    public void setComprarlana(int comprarlana) {
        this.comprarlana = comprarlana;
    }
    
}
