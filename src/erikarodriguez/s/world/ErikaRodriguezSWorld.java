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
import patterns.creational.abstracfactory.edificaciones.avionBorbandero;
import patterns.creational.abstracfactory.edificaciones.edificaciones;
import patterns.creational.abstracfactory.edificaciones.ejercitoDeCaballeria;
import patterns.creational.abstracfactory.edificaciones.ejercitoDeLanceros;
import patterns.creational.abstracfactory.edificaciones.misiles;
import patterns.creational.abstracfactory.edificaciones.recolectorDeBronce;
import patterns.creational.abstracfactory.edificaciones.recolectorDeOro;
import patterns.creational.abstracfactory.edificaciones.recolectorDePlata;
import patterns.creational.abstracfactory.edificaciones.superSoldado;
import patterns.creational.abstracfactory.edificaciones.tanquetas;
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
        System.out.println("                         1.Debastadores.\n"
                + "'La raza debastadores tiene una gran habilidad para la contruccion de edificaciones"
                + "son muy resistentes ante los ataques enemigos'");
        System.out.println("                                                                             ");
        System.out.println("                         2.Krill.\n"
                + "'La raza krill por años ha desarrollado tecnicas muy avanzadas para el reclutamiento"
                + "de ejercito, por lo tanto su gran habilidad es la fortaleza de su ejercito'");
        System.out.println("                                                                                   ");
        System.out.println("                         3.Soberanos.\n"
                + "'La raza soberanos como gran habilidad posee la rapidez para construir sus edificaciones"
                + "son muy resistentes, pero son demasiado costosas'");
        System.out.println("                                                                      ");
        System.out.println("INGRESE LA OPCION: ");
        int raza= leer.nextInt();
        System.out.println("                                                                      ");
        return raza;
        
    }
    
        public static String raz(String nombre){
        int opcion= opciones(nombre);
        
        String raz="";
        switch (opcion){
                case 1: 
                    raz="Debastadores";
            System.out.println("LA RAZA DEBASTADORES TIENE LOS SIGUIENTES RECURSOS \n "
            +"-VIDA: "+debastadores.getVida()+"\n"
            +"-ORO: "+debastadores.getRecursooro()+"\n"
            +"-PLATA: "+debastadores.getRecursoplata()+"\n"+"-BRONCE: "+debastadores.getRecursobronce());
                    break;
                                       
                case 2: 
                    raz="Krill";
        System.out.println("LA RAZA KRILL TIENE LOS SIGUIENTES RECURSOS: \n "
        +"-VIDA: "+krill.getVida()+"\n"
        +"-CUARZO: "+krill.getRecursocuarzo()+"\n"
        +"-DIAMANTE: "+krill.getRecursodiamante()+"\n"+"-PERLA: "+krill.getRecursoperla());
                    break;
                case 3: 
                    raz="Soberanos";
            System.out.println("RAZA SOBERANOS TIENE LOS SIGUIENTES RECURSOS:\n"
            +"-VIDA: "+soberanos.getVida()+"\n"
            +"-MADERA: "+soberanos.getRecursomadera()+"\n"
            +"-LANA: "+soberanos.getRecursolana()+"\n"+"-HIERRO: "+soberanos.getRecursohierro());
                    break;
            }
        return raz;
    }
    
    public static int opcioneshacer(String nombre){
        Scanner leer=new Scanner (System.in);
        edificaciones e=new edificaciones();//creando edificaciones
        System.out.println("                                                                        ");
        System.out.println("            JUGADOR "+nombre+" INGRESE LA OPCION QUE DESEA\n");
        System.out.println("                           1.crear.");
        System.out.println("                           2.contruir.");
        System.out.println("                           3.atacar.");
        System.out.println("                           4.defender.");
        System.out.println("                                                                         ");
        System.out.println("INGRESE LA OPCION: ");
        int edificaciones=leer.nextInt();
        System.out.println("                                                                          ");
        return edificaciones;
    }
            public static String hacer(String nombre){
        int opcion= opcioneshacer(nombre);
        
        String hacer="";
        switch (opcion){
                case 1: 
                    hacer="crear";
                    break;
                                       
                case 2: 
                    hacer="construir";
                    break;
                case 3: 
                    hacer="atacar";
                    break;
                case 4:
                    hacer="defender";
                    break;
            }
        return hacer;
    }
            
            public static int opcioncrear(String nombre){
                Scanner leer= new Scanner(System.in);
                edificaciones e=new edificaciones();//creando edificaciones
                System.out.println("                                                                        ");
                System.out.println("            JUGADOR "+nombre+" QUE DESEA CREAR \n");
                System.out.println("                           1.Ejercito de caballeria.");
                System.out.println("                           2.Ejercito de lanceros.");
                System.out.println("                           3.Misiles.");
                System.out.println("                           4.Super soldado.");
                System.out.println("                           5.tanquetas.");
                System.out.println("                           6.Avion borbandero");
                System.out.println("                                                                         ");
                System.out.println("INGRESE LA OPCION: ");
                int edificaciones=leer.nextInt();
                System.out.println("                                                                          ");
                return edificaciones;
            }
            public static String crear(String nombre){
            int opcion= opcioncrear(nombre);
        
                String crear="";
                    switch (opcion){
                            case 1: 
                                crear="ejercitoDeCaballeria";
                                ejercitoDeCaballeria.add();
                            break;
                                       
                            case 2: 
                                crear="ejercitoDeLanceros";
                                ejercitoDeLanceros.add();
                            break;
                            case 3: 
                                crear="Misiles";
                                misiles.add();
                             break;
                            case 4: 
                                crear="supersoldado";
                                superSoldado.add();
                             break;
                            case 5: 
                                crear="tanquetas";
                                tanquetas.add();
                             break;
                            case 6: 
                                crear="avionborbandero";
                                avionBorbandero.add();
                             break;
            }
        return crear;
    }          
            public static int opcionconstruir(String nombre){
                Scanner leer= new Scanner(System.in);
                edificaciones e=new edificaciones();//creando edificaciones
                System.out.println("                                                                        ");
                System.out.println("            JUGADOR "+nombre+" QUE DESEA CONSTRUIR \n");
                System.out.println("                           1.Recolector de Oro.");
                System.out.println("                           2.Recolector de Pata.");
                System.out.println("                           3.Recolector de Bronce.");
                System.out.println("                                                                         ");
                System.out.println("INGRESE LA OPCION: ");
                int edificaciones=leer.nextInt();
                System.out.println("                                                                          ");
                return edificaciones;
            }
            public static String construir(String nombre){
            int opcion= opcioncrear(nombre);
        
                String construir="";
                    switch (opcion){
                            case 1: 
                                construir="recolectordeoro";
                                recolectorDeOro.add();
                            break;
                                       
                            case 2: 
                                construir="recolectordeplata";
                                recolectorDePlata.add();
                            break;
                            case 3: 
                                construir="recolectordebronce";
                                recolectorDeBronce.add();
                             break;
            }
        return construir;
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
        String opcionhacer=hacer(p1n);
        String opcion_raza2=raz(p2n);//raza juador2
        String opcionhacer2=hacer(p2n);
        String opcioncrear=crear(p1n);
        String opcioncrear2=crear(p2n);
        //asignando nombres y razas a las clases creadas de jugador
        p1.nombre=p1n;//asignando nombre
        p1.raza=opcion_raza;//asignando raza
        p1.raza=opcionhacer;
        p1.raza=opcioncrear;
        p2.nombre=p2n;//asignando nombre
        p2.raza=opcion_raza2;//asignando raza
        p2.raza=opcionhacer2;
        p2.raza=opcioncrear2;
        
        
        
    }
}
        
    
