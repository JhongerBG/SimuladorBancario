/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario;

/**
 *
 * @author Johan
 */
public class CuentaEmpresarial extends CuentaBancaria {
    
    private double saldoMinimo = 500000; //saldo minimo que debe estar en la cuenta es de 100 mil pesos al intentar hacer una transaccion que deje por debajo de este monto se rechazara
    private double bonoFidelidad = 0.02; // al mantener un saldo por encima de los 10 millones de pesos se le agrega un bono equivalente al 2% con respecto al saldo total
    private int retirosDia = 2; //solo se permiten 2 retiros diarios por una comision de 5 mil pesos
    
    public CuentaEmpresarial(int numeroCuenta, Persona titular, double saldoInicial) {
        // super pasa los datos al constructor de cuentaBancaria
        super(numeroCuenta, titular, saldoInicial, "Empresarial");
    }
    
    
}
