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
public abstract class Dispositivo implements Conectable {
    
    private String nombre;
    private String descripcion;
    private double precio;

    public Dispositivo(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }

    @Override
    public void conecta() {
        System.out.println("Conecta el dispositivo");
    }

    @Override
    public void desconecta() {
        System.out.println("Desconecta el dispositivo");
    }

}
