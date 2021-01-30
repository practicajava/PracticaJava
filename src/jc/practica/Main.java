/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jcpalma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> words = Arrays.asList("hola", "mundo", "hola", "tal", "hola", "otra", "java");
        List<Integer> numeros = Arrays.asList(6, 10, 8, 10, 6, 10, 3, 9, 9, 1, 1, 2, 8, 6, 2, 5, 6, 4, 4, 10);

        System.out.println(words.lastIndexOf("hola"));
        System.out.println(words.indexOf("hola"));

        System.out.println(numeros);
        numeros.sort((a, b) -> b - a);
        System.out.println(numeros);

        System.out.println(words);
        words.sort((a, b) -> a.compareTo(b));
        System.out.println(words);

        List<Persona> people = Arrays.asList(new Persona("Juan", 30), new Persona("Pedro", 21));

        System.out.println(people);
        people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(people);

        
        Product p1 = new Product.Builder(1, "Lapto")
                .setBranch("Dell")
                .setPrice(870.20)
                .setStock(10)
                .build();
        
        Product p2 = new Product.Builder(2, "Teclado")
                .setBranch("Logitech")
                .setPrice(34.58)
                .setStock(100)
                .build();
        
        Product p3 = new Product.Builder(3, "Monitor 24\"")
                .setBranch("HP")
                .setPrice(320.99)
                .setStock(18)
                .build();
        
        //System.out.println(p1);
        //System.out.println(p2);
        //System.out.println(p3);
        
        List<Product> products = Arrays.asList(p1, p2, p3);
        
        System.out.println(products);
        products.sort( Product::compareToByName );
        System.out.println(products);
        products.sort(Product::compareTo);
        System.out.println(products);
        
        
    }

    public static void ejercicio1() {
        // Cuantas veces se repite un elemento de una lista

        List<Integer> numeros = Arrays.asList(6, 10, 8, 10, 6, 10, 3, 9, 9, 1, 1, 2, 8, 6, 2, 5, 6, 4, 4, 10);

        final Integer pivot = numeros.get(2);
        int count = -1;

        for (Integer n : numeros) {
            count += (n == pivot ? 1 : 0);
        }

        System.out.printf("%d se ha repetido %d veces\n", pivot, count);

    }

    public static void ejercicio1B() {
        List<Integer> numeros = Arrays.asList(6, 10, 8, 10, 6, 10, 3, 9, 9, 1, 1, 2, 8, 6, 2, 5, 6, 4, 4, 10);
        final Integer pivot = numeros.get(2);

        long count = numeros.stream().filter(n -> n == pivot).count() - 1;

        System.out.printf("%d se ha repetido %d veces\n", pivot, count);

    }

}
