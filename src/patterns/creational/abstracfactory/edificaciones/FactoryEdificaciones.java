/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstracfactory.edificaciones;

import patterns.creational.abstracfactory.AbstractFactory;
import patterns.creational.abstracfactory.razas.razas;
import patterns.creational.abstracfactory.recursos.recursos;

/**
 *
 * @author erikav
 */
public class FactoryEdificaciones implements AbstractFactory {

    @Override
    public razas getrazas(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public recursos getrecursos(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public edificaciones getedificaciones(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
