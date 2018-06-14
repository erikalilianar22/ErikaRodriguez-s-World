/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erikarodriguez.s.world;

import static erikarodriguez.s.world.ErikaRodriguezSWorld.raz;
import java.util.Scanner;
import static java.lang.Math.random;
import java.util.*;
import java.util.stream.IntStream;
import patterns.creational.abstracfactory.razas.debastadores;
import patterns.creational.abstracfactory.razas.krill;
import patterns.creational.abstracfactory.razas.razas;
import patterns.creational.abstracfactory.razas.soberanos;
/**
 *
 * @author erikav
 */
public class ErikaRodriguezSWorld {    
    
    public static int opciones(String nombre){
        Scanner leer= new Scanner(System.in);
        razas r = new razas(); //crear una raza
        System.out.println("                                                 ");
        System.out.println("            JUGADOR " +nombre+ " INGRESE LA RAZA QUE DESEA            \n");
        System.out.println("                         1.Debastadores.");
        System.out.println("                         2.Krill.");
        System.out.println("                         3.Soberanos.");
        System.out.println("                                                                      ");
        System.out.println("INGRESE LA OPCION: ");
        int raza= leer.nextInt();
        System.out.println("                                                                      ");
        if(raza == 1){
            r = new debastadores();
            
        }
        return raza;
    }

    
    public static String raz(String nombre){
        int opcion= opciones(nombre);
        
        String raz="";
        switch (opcion){
                case 1: 
                    raz="Debastadores";
                    break;
                                       
                case 2: 
                    raz="Krill";
                    break;
                case 3: 
                    raz="Soberanos";

                    break;
            }
        return raz;
    }
    
    public static String Aleatorioinicio(){
        int aleatorio = (int) (Math.random() * 2) + 1;
        String nombre_f="";
        if (aleatorio==1){
            nombre_f= "salio el jugador 1";
            
        }
        if(aleatorio==2){
            nombre_f= "salio el jugador 2";
        }
        return nombre_f;
    }
    

    public static void main(String[] args) {
        
        JugadoresN p1 = new JugadoresN();
        JugadoresN p2 = new JugadoresN();
        Scanner leer= new Scanner(System.in);
	    
	System.out.println("              ¡BIENVENIDO AL JUEGO ERIKARODRIGUEZWORLD!");
	System.out.println("                                                 ");
	System.out.println("--INGRESE NOMBRE DEL JUGADOR 1:");
	String p1n=leer.nextLine(); 
	System.out.println("--INGRESE NOMBRE DEL JUGADOR 2:");
	String p2n=leer.nextLine();
        String opcion_raza=raz(p1n);//raza jugador1
        String opcion_raza2=raz(p2n);//raza juador2
        
        //asignando nombres y razas a las clases creadas de jugador
        p1.nombre=p1n;//asignando nombre
        p1.raza=opcion_raza;//asignando raza
        p2.nombre=p2n;//asignando nombre
        p2.raza=opcion_raza2;//asignando raza
        
        
        System.out.println(p1n+" SU RAZA ES "+opcion_raza+"\n");        
        if (opcion_raza == "Soberanos"){
            System.out.println("RAZA SOBERANOS TIENE LOS SIGUIENTES RECURSOS:\n"
            +"VIDA:"+soberanos.getVida()+"\n"
            +"RECURSOS \n"+"-MADERA: "+soberanos.getRecursomadera()+"\n"
            +"-LANA: "+soberanos.getRecursolana()+"\n"+"-HIERRO: "+soberanos.getRecursohierro());
        }
        if (opcion_raza == "Debastadores"){
            System.out.println("LA RAZA DEBASTADORES TIENE LOS SIGUIENTES RECURSOS \n "
            +"vida inicial:"+debastadores.getVida()+"\n"
            +"recursos iniciales: \n"+"oro: "+debastadores.getRecursooro()+"\n"
            +"plata: "+debastadores.getRecursoplata()+"\n"+"bronce: "+debastadores.getRecursobronce());
            
        }
        if("Krill".equals(opcion_raza)){
        System.out.println("la raza krill tiene: \n "
        +"vida inicial:"+krill.getVida()+"\n"
        +"recursos iniciales: \n"+"cuarzo"+krill.getRecursocuarzo()
        +"diamante"+krill.getRecursodiamante()+"perla"+krill.getRecursoperla());
        }
        
        
        System.out.println(p2n+" SU RAZA ES "+opcion_raza2);
        System.out.println("                                                                      ");
        
        if (opcion_raza == "Soberanos"){
            System.out.println("la raza soberanos tiene: \n"
            +"vida inicial:"+soberanos.getVida()+"\n"
            +"recursos iniciales: \n"+"madera: "+soberanos.getRecursomadera()+"\n"
            +"lana: "+soberanos.getRecursolana()+"\n"+"hierro: "+soberanos.getRecursohierro());
        }
        if (opcion_raza == "Debastadores"){
            System.out.println("la raza debastadores tiene: \n "
            +"vida inicial:"+debastadores.getVida()+"\n"
            +"recursos iniciales: \n"+"oro"+debastadores.getRecursooro()
            +"plata"+debastadores.getRecursoplata()+"plata"+debastadores.getRecursobronce());
            
        }
        if("Krill".equals(opcion_raza)){
        System.out.println("la raza krill tiene: \n "
        +"vida inicial:"+krill.getVida()+"\n"
        +"recursos iniciales: \n"+"cuarzo"+krill.getRecursocuarzo()
        +"diamante"+krill.getRecursodiamante()+"perla"+krill.getRecursoperla());
        }

        
    }
}
        
    
