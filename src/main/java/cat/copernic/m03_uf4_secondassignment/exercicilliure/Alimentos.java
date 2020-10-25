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
public class Alimentos extends Item {
    
    // He añadido una variable a la subclase de Alimentos para poder conocer el precio (en Euros) por Kilo de alimento
    
    private double euroPorKilo;
    
    public Alimentos(double euroPorKilo, double precio, String descripcion, String nombre, int id) {
        super(precio, descripcion, nombre, id);
        this.euroPorKilo = euroPorKilo;
    }
    
}
