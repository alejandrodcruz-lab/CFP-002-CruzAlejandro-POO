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
 * public class UsoAuto {
 *
 * public static void main(String[] args) {
 *
 * Auto auto1 = new Auto("VW","Golf",9999);
 *
 * auto1.estadoAuto(); }
 *
 * }
 *
 */
class Auto {

    public Auto() {

    }

    public Auto(String marca, String modelo, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public String getEstadoAuto() {

        if (kilometros == 0) {

            estado = "Esta nuevo";
        } else if (kilometros < 10000) {
            estado = "Poco usado";
        } else if (kilometros < 100000) {
            estado = "Usado";
        } else {
            estado = "Bastante usado";
        }

        return estado;
    }

    private String marca;
    private String modelo;
    private int kilometros;
    private String estado;
}
