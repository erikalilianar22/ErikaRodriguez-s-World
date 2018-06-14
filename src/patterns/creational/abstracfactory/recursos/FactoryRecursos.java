/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstracfactory.recursos;

import patterns.creational.abstracfactory.AbstractFactory;
import patterns.creational.abstracfactory.edificaciones.edificaciones;
import patterns.creational.abstracfactory.razas.razas;

/**
 *
 * @author erikav
 */
public class FactoryRecursos implements AbstractFactory {

    @Override
    public razas getrazas(String type) {
        return null;
    }

    @Override
    public recursos getrecursos(String type) {
            switch(type){
                case "oro":
                    return new oro();
                case "plata":
                    return new plata();
                case "bronce":
                    return new bronce();
                case "madera":
                    return new madera();
                case "hierro":
                    return new hierro();
                case "lana":
                    return new lana();
                case "cuarzo":
                    return new cuarzo();
                case "diamante":
                    return new diamante();
                case "perla":
                    return new perla();
            }
        return null;
    }

    @Override
    public edificaciones getedificaciones(String type) {
        return null;
    }
    
}
