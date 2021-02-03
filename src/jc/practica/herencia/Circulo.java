/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica.herencia;

import java.math.MathContext;

/**
 *
 * @author jcpalma
 */
public final class  Circulo extends Figura {
 
    private static final double PI = 3.1416;
    
    private final double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double diametro() {
        return this.radio * 2;
    }

    @Override
    public double area() {
        return Circulo.PI * Math.pow(this.radio, this.radio);
    }

    @Override
    public double volumen() {
        return (4.0/3.0) * Circulo.PI * Math.pow(radio, radio);
    }

    @Override
    public void dibujar() {
        System.out.println("Circulo: " + radio);
    }
    
    
    
}
