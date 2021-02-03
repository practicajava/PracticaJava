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
public abstract class Figura {
    
    public Figura() {};
    
    public void dibujar() {
        System.out.println("Dibujando figura");
    }
    
    public abstract double area();
    
    public abstract double volumen();
    
}
