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
public class razas {

    private static int recursomadera() {
        return recursomadera(100);
    }

    private static int recursolana() {
        return recursolana(200);
    }

    private static int recursohierro() {//asignar valores
        return recursohierro(300);
    }

    private static int recursomadera(int i) {//retorna los valores
        return i;
    }

    private static int recursolana(int i) {
        return i;
    }

    private static int recursohierro(int i) {
        return i;
    }
    public int vida;
    public int recursooro;
    public int recursoplata;
    public int recursobronce;
    public int recursohierro;
    public int recursomadera;
    public int recursolana;
    public int recursocuarzo;
    public int recursodiamante;
    public int recursoperla;
    
    public void recursos(){ 
    }
    public void edificaciones(){
    }
    public void atacar(){
    }
    public void defender(){
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
    
    
    public static int getRecursohierro() {
        return recursohierro();
    }

    public void setRecursohierro(int recursohierro) {
        this.recursohierro = recursohierro;
    }

    public static int getRecursomadera() {
        return recursomadera();
    }

    public void setRecursomadera(int recursomadera) {
        this.recursomadera = recursomadera;
    }

    public static int getRecursolana() {
        return recursolana();
    }

    public void setRecursolana(int recursolana) {
        this.recursolana = recursolana;
    }
   
    }



