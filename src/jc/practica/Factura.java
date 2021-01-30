/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.DateFormatter;

/**
 *
 * @author jcpalma
 */
public class Factura {

    private static int secuencia = 0;

    private int idFactura;
    private int numeroFactura;
    private LocalDate fechaFactura;
    private int idCliente;
    private List<DetalleFactura> detalle;

    public Factura(int numero, LocalDate fecha, int cliente) {

        synchronized (this) {
            this.idFactura = ++Factura.secuencia;
        }

        this.numeroFactura = numero;
        this.fechaFactura = fecha;
        this.idCliente = cliente;
        this.detalle = new ArrayList<>();
    }

    /**
     * @return the idFactura
     */
    public int getIdFactura() {
        return idFactura;
    }

    /**
     * @param idFactura the idFactura to set
     */
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    /**
     * @return the numeroFactura
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * @param numeroFactura the numeroFactura to set
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * @return the fechaFactura
     */
    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    /**
     * @param fechaFactura the fechaFactura to set
     */
    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the detalle
     */
    public final List<DetalleFactura> getDetalle() {
        return detalle;
    }

    public void agregarDetalle(int idProducto, int cantidad, double precio, double isv, double descuento) {
        int id = detalle.size() + 1;
        DetalleFactura linea = new DetalleFactura(id, idProducto, cantidad, precio, isv, descuento);
        detalle.add(linea);
    }

    public void agregarDetalle(int idProducto, int cantidad, double precio, double isv) {
        int id = detalle.size() + 1;
        DetalleFactura linea = new DetalleFactura(id, idProducto, cantidad, precio, isv);
        detalle.add(linea);
    }

    public void agregarDetalle(int idProducto, int cantidad, double precio) {
        int id = detalle.size() + 1;
        DetalleFactura linea = new DetalleFactura(id, idProducto, cantidad, precio);
        detalle.add(linea);
    }

    public double getTotal() {
        double total = 0.0;
        for (DetalleFactura linea : detalle) {
            total += linea.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("Factura No.:").append(numeroFactura).append("\t\t")
                .append("Fecha: ").append(fechaFactura.format(DateTimeFormatter.ISO_DATE)).append("\n")
                .append("Cliente: ").append(Facturador.obtenerInfoCliente(idCliente).getNombreCliente()).append("[").append(idCliente).append("]\n")
                .append("-----------\n");

        for (DetalleFactura linea : detalle) {
            sb.append(linea).append("\n");
        }

        sb.append("-----------\n")
                .append("Total: ").append(getTotal());

        return sb.toString();
    }

}
