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
public class FactoryEdificaciones implements AbstractFactory{
    
    @Override
    public razas getrazas(String type) {
        return null;
}

    @Override
    public recursos getrecursos(String type) {
        return null;
    }

    @Override
    public edificaciones getedificaciones(String type) {
        switch (type){
            case "tanquetas":
                return new tanquetas();
            case "avionBorbandero":
                return new avionBorbandero();
            case "misiles":
                return new misiles();
            case "superSoldado":
                return new superSoldado();
            case "ejercitoDeLanceros":
                return new ejercitoDeLanceros();
            case "ejercitoDeCaballeria":
                return new ejercitoDeCaballeria();
            case "CentroDeMando":
                return new CentroDeMando();
            case "recolectorDeOro":
                return new recolectorDeOro();
            case "recolectorDeBronce":
                return new recolectorDeBronce();
            case "recolectorDePlata":
                return new recolectorDePlata();
            case "recolectorDeMadera":
                return new recolectorDeMadera();
            case "recolectorDeHierro":
                return new recolectorDeHierro();
            case "recolectorDeLana":
                return new recolectorDeLana();
            case "recolectorDeCuarzo":
                return new recolectorDeCuarzo();
            case "recolectorDeDiamante":
                return new recolectorDeDiamante();
            case "recolectorDePerla":
                return new recolectorDePerla();
                
        }
        return null;
    }

    
}
