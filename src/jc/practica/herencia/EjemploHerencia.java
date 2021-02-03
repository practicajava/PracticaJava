/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica.herencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jcpalma
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Figura> figuras = new ArrayList<>();
        
        figuras.add( new Circulo(1) );
        figuras.add( new Circulo(2.5) );
        figuras.add( new Cuadrado(5) );
        figuras.add( new Cuadrado(8) );
        
        for (Figura f : figuras) {
            
            f.dibujar();
            
            if( f instanceof Circulo) {
                Circulo c = (Circulo) f;
                System.out.printf("\tDiametro del círculo: %.2f\n", c.diametro());
            }
            
            
        }
        
        
        
        
    }
    
}
