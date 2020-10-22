/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author pep
 */
public class M03_UF04_SecondAssignment {
    
    public static void main(String[] args) {
        
        Dispositivo dispositivo1 = new Ordenador("Versus PC", "Un PC para dominarlos a todos", 1055.55);
        dispositivo1.conecta();
        
        Dispositivo dispositivo2 = new TerminalDeVenta("TPV","Un aliado para tus finanzas, esta vez en versión táctil", 629.00 );
        
        dispositivo2.conecta();
        dispositivo2.desconecta();
        
        Mobiles dispositivo3 = new Tablet("Microsoft Surface Pro 7","Mantente conectado y trabaja a tu modo con Surface", 849.00);
        dispositivo3.conecta();
        dispositivo3.reset();
        
        Mobiles dispositivo4 = new Portatil("MacBook Pro 13 pulgadas","Un despliegue tecnológico a la altura de pocos", 2049.00);
        dispositivo4.conecta();
        dispositivo4.desconecta();
        dispositivo4.conecta();
        dispositivo4.reset();
        
        // Utilizo el operador 'instanceof' para conocer si los dispositivos son del tipo que les he asignado
        // El dispositivo1 me devuelve 'true' ya que Ordenador es una subclase de Sobremesa
        // En cambio el dispositivo2 me devuelve 'false' ya que Ordenador no es una subclase de Mobiles
        System.out.println(dispositivo1 instanceof Sobremesa);
        System.out.println(dispositivo2 instanceof Mobiles);
        System.out.println(dispositivo3 instanceof Mobiles);
        
        System.out.println(dispositivo2 instanceof Dispositivo);
        System.out.println(dispositivo4 instanceof Dispositivo);
        
    }
    
}
