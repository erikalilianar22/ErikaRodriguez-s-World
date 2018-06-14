/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstracfactory.razas;
import patterns.creational.abstracfactory.razas.razas;

/**
 *
 * @author erikav
 */
public class debastadores extends razas {

    public static int getVida() {
        return 1000;
    }

     public int vida;
     public String recursos;
     public centrodemando centrodemando;
     

    @Override
    public void atacar() {
        System.out.println("debastadores te ha atacado");
    }
     @Override
    public void defender(){
    }
     @Override
    public void edificaciones(){
    }
     @Override
    public void recursos(){
    }
    

    public static void main(String [] args){
        razas debastadores=new debastadores();
        //crear que el centro de mando tenga su propoa vida y recursos
        

        
      //  debastadores.atacar();
        
    }

    private static class centrodemando {
        int vida;
        int recursooro;
        int recursoplata;
        int recursobronce;
        int recursos;

        public centrodemando(int recursos, int vida, int recursooro, int recursoplata, int recursobronce) {
            this.recursobronce=recursobronce;
            this.recursooro=recursooro;
            this.recursoplata=recursoplata;
            this.vida=vida;
            this.recursos=recursos;
        }

        public centrodemando() {
        }

        public int getVida() {
            return vida;
        }

        public void setVida(int vida) {
            this.vida = vida;
        }

        public int getRecursooro() {
            return recursooro;
        }

        public void setRecursooro(int recursooro) {
            this.recursooro = recursooro;
        }

        public int getRecursoplata() {
            return recursoplata;
        }

        public void setRecursoplata(int recursoplata) {
            this.recursoplata = recursoplata;
        }

        public int getRecursobronce() {
            return recursobronce;
        }

        public void setRecursobronce(int recursobronce) {
            this.recursobronce = recursobronce;
        }

        public static void main(String [] args){
        centrodemando centrodemando =new centrodemando();
        
        centrodemando.setVida(500);
        centrodemando.setRecursooro(3000);
        centrodemando.setRecursoplata(2000);
        centrodemando.setRecursobronce(1000);
        //crear que el centro de mando tenga su propoa vida y recursos
        
        
        System.out.println("el centro de mando de debastadores tiene: \n "
                            +"vida inicial:"+centrodemando.getVida()+"\n"
                            +"recursos iniciales: \n"+"oro"+centrodemando.getRecursooro()
                            +"plata"+centrodemando.getRecursoplata()+"plata"+centrodemando.getRecursobronce());
        
    
        
    }
    }
    
    
}


