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
public class Persona implements Comparable<Persona>{

    private final String name;
    private final int age;
    
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) obj;
        
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge();
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{").append(getName()).append(", ").append(getAge()).append("}");
        return sb.toString();
        //return "{" + name + ", " + age + "}";
    }

    @Override
    public int compareTo(Persona p) {
        return this.getAge() - p.getAge();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    
    

}
