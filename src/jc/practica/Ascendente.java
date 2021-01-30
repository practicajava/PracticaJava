/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica;

import java.util.Comparator;

/**
 *
 * @author jcpalma
 */
public class Ascendente implements Comparator<Integer>{

    @Override
    public int compare(Integer a, Integer b) {
        return a - b;
    }

    
}
