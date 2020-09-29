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
class CuentaBanco {

    public CuentaBanco() {
    }

    ;
    
    public CuentaBanco(String nombre, String apellido, String tipoDeCuenta, float saldo) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }

    public void extraer(float valor) {

        if (valor != 0 && valor > 0) {
            if (saldo >= valor) {
                saldo = (saldo - valor);
                System.out.println("Su nuevo saldo es: " + saldo);
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Monto invalido");
        }
    }
    private String nombre, apellido, tipoDeCuenta;
    private float saldo;
}
