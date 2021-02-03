/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica.herencia;

import static java.lang.Math.pow;

/**
 *
 * @author jcpalma
 */
public class Cuadrado extends Figura {
    
    private final double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }

    @Override
    public double volumen() {
        return pow(lado, 3);
    }
    
    
}
