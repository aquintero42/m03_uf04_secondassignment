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
public class M03_UF4_SecondAssignment_ExerciciLliure {
    public static void main(String[] args) {
        
        // He creado dos carritos de la compra para separar los items que necesitaremos cada semana y los caprichos
        CarritoDeLaCompra caprichos = new CarritoDeLaCompra();
        CarritoDeLaCompra compraSemanal = new CarritoDeLaCompra();
        
        // Aquí crearemos todos los tipos de items necesarios
        Item ropa1 = new Ropa(true,"XL", 80.97, "Chaqueta repelente al agua inspirada en el legado de Nike", "Nike Sportswear DNA", 001);
        Item ropa2 = new Ropa(false, "L", 99.00, "El ajuste ceñido definitivo con un estilo contemporáneo", "510 Skinny Jeans", 002);
        Item ropa3 = new Ropa(false, "Talla única", 4.50, "Únete a la Alianza con estos excelentes calcetines", "Calcetines World of Warcraft", 003);
        Item ropa4 = new Ropa(true, "L", 2, "Ropa interior de un solo uso para todo tipo de personas con problemas de perdida de orina", "Calzoncillos impermeables", 004);
        
        Item alimento1 = new Alimentos(1.69, 16.90, "Patatas Monalisa especiales de Segovia", "Patatas", 401);
        Item alimento2 = new Alimentos(0.73, 13.61, "Purina Friskies pienso para perro adulto aves y verduras", "Pienso", 402);
        Item alimento3 = new Alimentos(4.72, 4.72, "Haribo cerezas con azúcar", "Chucherias", 403);
        
        Item cosmetico1 = new Cosmeticos(true, 7.90, "Champú sólido para cabello encrespado artesanal y ecológico. 100% Natural y vegano", "Champú", 301);
        Item cosmetico2 = new Cosmeticos(false, 16.14, "Brochas de maquillaje profesional de la más alta calidad", "Brochas maquillaje", 302);
        Item cosmetico3 = new Cosmeticos(false, 13.50, "Jabón facial para los poros", "Jabón facial", 303);
        Item cosmetico4 = new Cosmeticos(true, 17.99, "Crema facial de acido hialuronico vegano 50ml", "Crema facial", 304);
        Item cosmetico5 = new Cosmeticos(false, 7.99, "L'Oréal Paris Makeup Designer", "Máscara pestañas", 305);
        
        // Creamos los detalles de cada item
        Detalle detalleRopa1 = new Detalle(01,1, ropa1);
        Detalle detalleRopa2 = new Detalle(02,2, ropa2);
        Detalle detalleRopa3 = new Detalle(03,1, ropa3);
        Detalle detalle2Ropa3 = new Detalle(03,2,ropa3);
        Detalle detalleRopa4 = new Detalle(04,7, ropa4);
        
        Detalle detalleAlimento1 = new Detalle(41,2, alimento1);
        Detalle detalleAlimento2 = new Detalle(42,6, alimento2);
        Detalle detalleAlimento3 = new Detalle(43,1, alimento3);
        Detalle detalle2Alimento2 = new Detalle(44,3, alimento2);        
        
        Detalle detalleCosmetico1 = new Detalle(31, 2, cosmetico1);
        Detalle detalleCosmetico2 = new Detalle(32, 1, cosmetico2);
        Detalle detalleCosmetico3 = new Detalle(33, 3, cosmetico3);
        Detalle detalleCosmetico4 = new Detalle(34, 6, cosmetico4);
        Detalle detalleCosmetico5 = new Detalle(35, 1, cosmetico5);
        
        // Añadimos a los dos carritos los detalles correspondientes
        caprichos.añade(detalleRopa1);
        caprichos.añade(detalleRopa2);
        caprichos.añade(detalle2Ropa3);
        compraSemanal.añade(detalleRopa3);
        compraSemanal.añade(detalleRopa4);
        
        compraSemanal.añade(detalleAlimento1);
        compraSemanal.añade(detalleAlimento2);
        compraSemanal.elimina(detalleAlimento2);
        compraSemanal.añade(detalle2Alimento2);
        caprichos.añade(detalleAlimento3);
        
        caprichos.añade(detalleCosmetico2);
        caprichos.añade(detalleCosmetico4);
        caprichos.añade(detalleCosmetico5);
        compraSemanal.añade(detalleCosmetico1);
        compraSemanal.añade(detalleCosmetico3);
        
        // Checkout de los dos carritos de la compra
        System.out.println(caprichos.checkout());
        System.out.println(compraSemanal.checkout());
        
        // Operadores instanceof
        System.out.println(ropa1 instanceof Alimentos);
        System.out.println(ropa1 instanceof Item);
        System.out.println(cosmetico1 instanceof Cosmeticos);
        System.out.println(cosmetico2 instanceof Item);
        System.out.println(detalleAlimento3 instanceof Detalle);
    }
}
