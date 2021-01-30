/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica;

import java.time.LocalDate;

/**
 *
 * @author jcpalma
 */
public class Facturador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creación de una factura.
        Factura f1 = new Factura(103521, LocalDate.now(), 1432);
        f1.agregarDetalle(2, 10, 12.56);
        f1.agregarDetalle(72, 3, 102.20);
        f1.agregarDetalle(1024, 1, 12050.99);
        
        
        // Imprime la factura
        System.out.println(f1);
        
    }
    
    public static Cliente obtenerInfoCliente(int idCliente) {
        return new Cliente();
    }
    
    public static Product buscarProducto(int idProducto) {
        return new Product.Builder(2, "Producto").build();
    }
    
}
