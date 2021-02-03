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
public class ConexionOracle extends Conexion implements Backupable, Restoreable {
    
    
    public ConexionOracle() {
        super("Oracle", "12c");
    }

    @Override
    public void backup() {
        System.out.println("datapump -exp -dumpfile backup.dat");
    }

    @Override
    public void restore() {
        System.out.println("datapump -imp -dumpfile backup.dat");
    }
    
    
    
}
