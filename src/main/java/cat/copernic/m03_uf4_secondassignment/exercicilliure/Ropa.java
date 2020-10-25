/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf4_secondassignment.exercicilliure;

/**
 *
 * @author Adrian
 * 
 */
public class Ropa extends Item {
    
    // He creado una variable tipo 'boolean' para determinar si una prenda de ropa es impermeable o no.
    // He creado una segunda varaible tipo 'String' para conocer la talla de nuestra ropa
    
    private boolean impermeable;
    private String talla;
    
    public Ropa(boolean impermeable,String talla, double precio, String descripcion, String nombre, int id) {
        super(precio, descripcion, nombre, id);
        this.impermeable = impermeable;
        this.talla = talla;
    }
    
}
