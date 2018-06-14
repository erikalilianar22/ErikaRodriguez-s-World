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
public class hierro extends recursos {
    int recolectarhierro;
    int comprarhierro;

    public hierro() {
    }

    public hierro(int recolectarhierro, int comprarhierro) {
        this.recolectarhierro = recolectarhierro;
        this.comprarhierro = comprarhierro;
    }

    public int getRecolectarhierro() {
        return recolectarhierro;
    }

    public void setRecolectarhierro(int recolectarhierro) {
        this.recolectarhierro = recolectarhierro;
    }

    public int getComprarhierro() {
        return comprarhierro;
    }

    public void setComprarhierro(int comprarhierro) {
        this.comprarhierro = comprarhierro;
    }
    
}
