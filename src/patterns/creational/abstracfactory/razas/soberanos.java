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
public class soberanos extends razas {


    public static int getVida() {
        return 10000;
    }
     public int vida;
     public String recursos;
     public centrodemando centrodemando;
     

    @Override
    public void atacar() {
        System.out.println("soberanos te ha atacado");
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
        razas soberanos=new soberanos();
        //crear que el centro de mando tenga su propoa vida y recursos
        
      //  debastadores.atacar();
        
    }

    private static class centrodemando {
        int vida;
        int recursomadera;
        int recursolana;
        int recursohierro;

        public centrodemando(int vida, int recursomadera, int recursolana, int recursohierro) {
            this.vida = vida;
            this.recursomadera = recursomadera;
            this.recursolana = recursolana;
            this.recursohierro = recursohierro;
        }

        private centrodemando() {
        }
        
        

        public int getVida() {
            return vida;
        }

        public void setVida(int vida) {
            this.vida = vida;
        }

        public int getRecursomadera() {
            return recursomadera;
        }

        public void setRecursomadera(int recursomadera) {
            this.recursomadera = recursomadera;
        }

        public int getRecursolana() {
            return recursolana;
        }

        public void setRecursolana(int recursolana) {
            this.recursolana = recursolana;
        }

        public int getRecursohierro() {
            return recursohierro;
        }

        public void setRecursohierro(int recursobrohierro) {
            this.recursohierro = recursobrohierro;
        }

        
        
        public static void main(String [] args){
        centrodemando centrodemando =new centrodemando();
        
        centrodemando.setVida(500);
        centrodemando.setRecursomadera(3000);
        centrodemando.setRecursolana(2000);
        centrodemando.setRecursohierro(1000);
        //crear que el centro de mando tenga su propoa vida y recursos
        
        
        System.out.println("el centro de mando de soberanos tiene: \n "
                            +"vida inicial:"+centrodemando.getVida()+"\n"
                            +"recursos iniciales: \n"+"madera"+centrodemando.getRecursomadera()
                            +"lana"+centrodemando.getRecursolana()+"hierro"+centrodemando.getRecursohierro());
        
    
        
    }
    }
    
    

}
