/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica.herencia;

/**
 *
 * @author jcpalma
 */
public abstract class Conexion  {
    
    private final String vendor;
    private final String version;
    
    public Conexion(String vendor, String version) {
        this.vendor = vendor;
        this.version = version;
    }
    
    public final String vendor() {
         return this.vendor;
    }
    
    public String version() {
        return this.version;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", vendor, version);
    }
    
    
    
}
