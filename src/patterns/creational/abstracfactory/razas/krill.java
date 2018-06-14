/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstracfactory.razas;

/**
 *
 * @author erikav
 */
public class krill extends razas {
     public int vida;
     public String recursos;
     public centrodemando centrodemando;
     

    @Override
    public void atacar() {
        System.out.println("krill te ha atacado");
    }
     @Override
    public void edificaciones(){
    }
     @Override
    public void recursos(){
    }
     @Override
    public void defender(){
    }
    

    public static void main(String [] args){
        razas krill=new krill();

        //crear que el centro de mando tenga su propoa vida y recursos
        
        

        
      //  debastadores.atacar();
        
    }

    private static class centrodemando {
        int vida;
        int recursocuarzo;
        int recursodiamante;
        int recursoperla;

        public centrodemando(int vida, int recursocuarzo, int recursodiamante, int recursoperla) {
            this.vida = vida;
            this.recursocuarzo = recursocuarzo;
            this.recursodiamante = recursodiamante;
            this.recursoperla = recursoperla;
        }

        
        private centrodemando() {
        }
        
        

        public int getVida() {
            return vida;
        }

        public void setVida(int vida) {
            this.vida = vida;
        }

        public int getRecursocuarzo() {
            return recursocuarzo;
        }

        public void setRecursocuarzo(int recursocuarzo) {
            this.recursocuarzo = recursocuarzo;
        }

        public int getRecursodiamante() {
            return recursodiamante;
        }

        public void setRecursodiamante(int recursodiamante) {
            this.recursodiamante = recursodiamante;
        }

        public int getRecursoperla() {
            return recursoperla;
        }

        public void setRecursoperla(int recursoperla) {
            this.recursoperla = recursoperla;
        }
        

        
        
        public static void main(String [] args){
        centrodemando centrodemando =new centrodemando();
        
        centrodemando.setVida(500);
        centrodemando.setRecursocuarzo(3000);
        centrodemando.setRecursodiamante(2000);
        centrodemando.setRecursoperla(1000);
        //crear que el centro de mando tenga su propoa vida y recursos
        
        
        System.out.println("el centro de mando de soberanos tiene: \n "
                            +"vida inicial:"+centrodemando.getVida()+"\n"
                            +"recursos iniciales: \n"+"cuarzo"+centrodemando.getRecursocuarzo()
                            +"diamante"+centrodemando.getRecursodiamante()+"perla"+centrodemando.getRecursoperla());
        
    
        
    }
    }
    
    


}


