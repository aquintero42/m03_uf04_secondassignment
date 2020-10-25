/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf4_secondassignment.exercicilliure;

/**
 *
 * @author Adrian
 */
public class Cosmeticos extends Item {
    
    // Utilizaremos este booleano para indicar si nuestro item cosmético está testeado o no contra animales.
    // En el caso de que el boolean sea true el cosmético no habrá sido probado con un animal.
    
    private boolean crueltyFree;
    
    public Cosmeticos(boolean crueltyFree, double precio, String descripcion, String nombre, int id) {
        super(precio, descripcion, nombre, id);
        this.crueltyFree = crueltyFree;
    }
    
}
