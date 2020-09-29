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
public class UsoPerroAutoBanco {
    
    public static void main(String[] args) {
        
        Perro Perrobotillo = new Perro("Seymur", "Canela", 2);
        System.out.println("Perro " + Perrobotillo.getNombre() + " dice " + Perrobotillo.getladrar());
        
        Auto auto1 = new Auto("VW", "Golf", 9999);
        System.out.println("El Auto esta " + auto1.getEstadoAuto());
        
        CuentaBanco cuenta1 = new CuentaBanco("Alejandro", "Cruz", "Ahorro", 500);
        
        cuenta1.extraer(100);
        
    }
    
}
