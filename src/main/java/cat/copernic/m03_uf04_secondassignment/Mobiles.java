/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author Adrian
 */
public abstract class Mobiles extends Dispositivo {
    
    public Mobiles(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }
    
    abstract void reset();
    
}
