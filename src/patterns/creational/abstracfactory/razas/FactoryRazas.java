/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstracfactory.razas;
import patterns.creational.abstracfactory.AbstractFactory;
import patterns.creational.abstracfactory.recursos.recursos;
import patterns.creational.abstracfactory.edificaciones.edificaciones;
/**
 *
 * @author erikav
 */
//creando los factory methods
public class FactoryRazas implements AbstractFactory{

    public static String mostrar;

    @Override
    public razas getrazas(String type) {
        switch (type){
            case "debastadores":
                return new debastadores();
            case "krill":
                return new krill();
            case "soberanos":
                return new soberanos();
        }
        return null;
    }

    @Override
    public recursos getrecursos(String type) {
        return null;
    }

    @Override
    public edificaciones getedificaciones(String type) {
        return null;
    }

    
}


