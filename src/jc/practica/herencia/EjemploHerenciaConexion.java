/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica.herencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jcpalma
 */
public class EjemploHerenciaConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Conexion> conexiones = Arrays.asList(new ConexionMySQL(), new ConexionOracle(), new ConexionChafa());
        
        List<Backupable> dbs = new ArrayList<>();
        
        for( Conexion c : conexiones ) {
            System.out.printf("Vendor: %s; Version: %s\n", c.vendor(), c.version());
            // Hacer backup
            
            if( c instanceof Backupable ) {
                Backupable db = (Backupable)c;
                dbs.add(db);
                db.backup();
            } else {
                System.out.printf("%s no soporta hacer backup.\n", c.vendor());
            }
            
        }
        
        // Vendor: MySQL; Version: v8.0.1
        // Vendor: Oracle; Version: 12c
        
        Circulo[] circulos = new Circulo[10];
        Arrays.fill(circulos, new Circulo(0));
        
        
        
        for( Circulo c : circulos ) {
            System.out.println(c.area());
        }
        System.out.println("");
        
        circulos[5] = new Circulo(23.8);
        for( Circulo c : circulos ) {
            System.out.println(c);
        }
        
    }
    
}
