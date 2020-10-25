/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf4_secondassignment.exercicilliure;

import cat.copernic.m03_uf4_secondassignment.exercicilliure.Finalizable;
import java.util.ArrayList;

/**
 *
 * @author Adrian
 * 
 * Implementa una ejercicio original con:
 * 
 * Herencia
 * 
 * Polimorfismo
 * 
 * Intefaces
 * 
 * Propiedades, etc.
 * 
 * 
 * Opcionalmente, usa este ejemplo para tu desarrollo.
 * 
 * Fecha limite entrega Domingo 25 a las 12 de la noche.
 * 
 * 
 * No olvides implementar y verificar checkout()
 * 
 */
public class CarritoDeLaCompra implements Finalizable {
    
    private ArrayList<Detalle> carrito = new ArrayList<>();
    
    public void añade(Detalle detalle) {
        carrito.add(detalle);
    }
    
    public void elimina(Detalle detalle) {
        carrito.remove(detalle);
    }

    @Override
    public double checkout() {
        double total = 0;
        int size = carrito.size();
        for (int i = 0; i < size; i++) {
            Detalle detalle = carrito.get(i);
            total += detalle.getCantidad() * detalle.getItem().getPrecio();
        }
        return total;
    }
    
}
