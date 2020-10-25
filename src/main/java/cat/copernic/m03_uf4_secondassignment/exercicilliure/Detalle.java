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
 * id, cantidad, Item 
 * 
 */
public class Detalle {
    private int id;
    private int cantidad;
    private Item item;

    public Detalle(int id, int cantidad, Item item) {
        this.id = id;
        this.cantidad = cantidad;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Detalle{" + "id=" + id + ", cantidad=" + cantidad + ", item=" + item + '}';
    }
    
}
