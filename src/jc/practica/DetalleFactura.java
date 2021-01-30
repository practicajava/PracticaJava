/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica;

import static java.lang.String.format;
import static jc.practica.StringUtil.center;

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
        this(idDetalle, idProducto, cantidad, precio, isv, 0.05);
    }

    public DetalleFactura(int idDetalle, int idProducto, int cantidad, double precio) {
        this(idDetalle, idProducto, cantidad, precio, 0.15, 0.05);
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
        return cantidad * precio;
    }

    /**
     * Devuelve el monto del impuesto.
     * @return el monto del impuesto.
     */
    public double getImpuesto() {
        return subTotal() * isv;
    }
    
    /**
     * Devuelve el monto del descuento (como un valor positivo).
     * @return un número real positivo con el monto del descuento.
     */
    public double getDescuento() {
        return subTotal() * porcentajeDescuento;
    }
    
    
    public double total() {
        return subTotal() + getImpuesto() - getDescuento();
    }

    public static String getTitulo() {
        StringBuilder sb = new StringBuilder()
                .append(format("|%s|", center("Linea", 5)))
                .append(format("%s|", center("Producto", 8)))
                .append(format("%s|", center("Cantidad", 10)))
                .append(format("%s|", center("Precio", 12)))
                .append(format("%s|", center("Sub Total", 13)))
                .append(format("%s|", center("Impuesto", 12)))
                .append(format("%s|", center("Descuento", 8)))
                .append(format("%s|", center("Total", 12)));
        return sb.toString();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("|")
                .append(format(" %03d ", idDetalle))
                .append(format("| %6d ", idProducto))
                .append(format("| %,8d ", cantidad))
                .append(format("| %,10.2f ", precio))
                .append(format("| %,11.2f ", subTotal()))
                .append(format("| %,10.2f ", getImpuesto()))
                .append(format("| %(,7.2f ", getDescuento()))
                .append(format("|%,11.2f|", total()));

        return sb.toString();
    }

}
