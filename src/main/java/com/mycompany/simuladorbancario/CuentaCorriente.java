/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario;

/**
 *
 * @author Johan
 */
public class CuentaCorriente extends CuentaBancaria {
    
    private double limiteSobregiro = 500000;
    private double tasaInteresSobregiro = 0.03;
    
    public CuentaCorriente(int numeroCuenta, Persona titular, double saldoInicial) {
        // super pasa los datos al constructor de cuentaBancaria
        super(numeroCuenta, titular, saldoInicial, "Corriente");
    }
    
    
    
}
