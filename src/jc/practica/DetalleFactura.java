/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica;

/**
 *
 * @author jcpalma
 */
public class DetalleFactura {
    
    private final int idDetalle;
    private final int idProducto;
    private final int cantidad;
    private final double precio;
    private final double isv;
    private final double porcentajeDescuento;
    
    public DetalleFactura(int idDetalle, int idProducto, int cantidad, double precio, double isv, double descuento) {
        this.idDetalle = idDetalle;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.isv = isv;
        this.porcentajeDescuento = descuento;
    }
    
    public DetalleFactura(int idDetalle, int idProducto, int cantidad, double precio, double isv) {
        this(idDetalle,idProducto,cantidad,precio, isv, 0);
    }
    
    public DetalleFactura(int idDetalle, int idProducto, int cantidad, double precio) {
        this(idDetalle,idProducto,cantidad,precio, 0.19, 0);
    }
    

    /**
     * @return the idDetalle
     */
    public int getIdDetalle() {
        return idDetalle;
    }
    
    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }


    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    
    /**
     * @return the isv
     */
    public double getIsv() {
        return isv;
    }

    /**
     * @return the porcentajeDescuento
     */
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    
    public double subTotal() {
        double st = cantidad * precio;
        return st + (st * isv) - (st * porcentajeDescuento);
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder("[ ")
                .append(idDetalle).append(" | ")
                .append(idProducto).append(" | ")
                .append(cantidad).append(" | ")
                .append(precio).append(" | ")
                .append(isv).append("% | ")
                .append(porcentajeDescuento ).append("% | ")
                .append(subTotal())
                .append(" ]");
        
        return sb.toString();
    }
    
    
    
}
