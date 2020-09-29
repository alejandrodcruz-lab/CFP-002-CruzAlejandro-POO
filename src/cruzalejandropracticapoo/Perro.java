/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruzalejandropracticapoo;

/**
 *
 * @author EntornoVM
 */
/**
 * public class UsoPerro {
 *
 * public static void main(String[] args) {
 *
 * Perro Perrobotillo = new Perro("Seymur", "Canela",2);
 *
 * System.out.println("Perro "+ Perrobotillo.getNombre()+" dice
 * "+Perrobotillo.getladrar()); }
 *
 * }
 *
 */
class Perro {

    public Perro(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {

        return this.nombre;
    }

    public String getladrar() {

        return "Guau guauuu!!";
    }

    private final String nombre;
    private final String color;
    private int edad;
}
