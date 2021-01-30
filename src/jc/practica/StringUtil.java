/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica;

/**
 *
 * @author jcpalma
 */
public class StringUtil {

    private StringUtil() {
    }
    
    /**
     * Centra una cadena según el ancho indicado.
     * @param texto es la cadena.
     * @param width es el ancho que se requiere que ocupe el texto centrado.
     * @return un texto con espacios en blancos a ambos lados de la cadena.
     */
    public static String center(String texto, int width) {
        if ( width <= 0 || width <= texto.length()) {
            return texto;
        }
        int size = (width - texto.length()) / 2;
        return String.format("%s%s%s", " ".repeat(size ), texto, " ".repeat(size));
    }

}
