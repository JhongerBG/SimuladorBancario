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
    
    private double limiteSobregiro = -500000;
    private double comisionRetiro = 0.01;
    private double tasaInteresSobregiro = 0.03;
    
    public CuentaCorriente(int numeroCuenta, Persona titular, double saldoInicial) {
        // super pasa los datos al constructor de cuentaBancaria
        super(numeroCuenta, titular, saldoInicial, "Corriente");
    }
    
    @Override
    public void retirarMonto(double monto){
        if(saldo >= limiteSobregiro){
            if(saldo <= 0){
                System.out.println("Se aplico la comision del retiro del 1% y la tasa de sobregiro del 3%");
                saldo = saldo - (monto + (monto * comisionRetiro) + (monto * tasaInteresSobregiro));
            }else{
                System.out.println("Se aplico la comision del retiro del 1%");
                saldo = saldo - (monto + (monto * comisionRetiro));
            }
        }
    }
    
    @Override
    public boolean confirmarRetiro(double monto){
        if((saldo - monto) > limiteSobregiro){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
