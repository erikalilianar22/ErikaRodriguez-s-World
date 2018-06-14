/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstracfactory;
import patterns.creational.abstracfactory.recursos.FactoryRecursos;
import patterns.creational.abstracfactory.razas.FactoryRazas;
import patterns.creational.abstracfactory.edificaciones.FactoryEdificaciones;
/**
 *
 * @author erikav
 */
public class FactoryProducer {
        
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "razas":
                return  new FactoryRazas();
            case "recursos":
                return new FactoryRecursos();
            case "edificaciones":
                return new FactoryEdificaciones();
        }
        return null;
    }
    
}
