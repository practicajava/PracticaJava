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
public class ConexionMySQL extends Conexion implements Backupable, Restoreable {
    
    public ConexionMySQL() {
        super("MySQL","v8.0.1");
    }

    @Override
    public String version() {
        return super.version() + " RC1"; 
    }

    @Override
    public void backup() {
        System.out.println("mysqldump -u root -p --all-database > backup.sql");
    }

    @Override
    public void restore() {
        System.out.println("mysql -u -p < backup.sql");
    }
    
    
    
}
