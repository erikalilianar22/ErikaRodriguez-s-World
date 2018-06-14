/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstracfactory;

import patterns.creational.abstracfactory.edificaciones.edificaciones;
import patterns.creational.abstracfactory.razas.razas;
import patterns.creational.abstracfactory.recursos.recursos;

/**
 *
 * @author erikav
 */
public interface AbstractFactory {
    razas getrazas(String type);
    recursos getrecursos(String type);
    edificaciones getedificaciones(String type);
    
}
