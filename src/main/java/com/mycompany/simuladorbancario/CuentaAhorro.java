/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario;

/**
 *
 * @author Johan
 */
public class CuentaAhorro extends CuentaBancaria {
    private int retirosMesMax = 3; //Esté es el limite de retiros maximos por mes sin que el programa el cobre una comisión del 2%
    private double saldoPromedio = 1000000; // si el saldo promedio mensual supera el millon de pesos mensual el sistema puede aplicar un bono de fidelidad del 1%
    private double saldoMinimo = 20000; //saldo minimo que debe estar en la cuenta es de 20 mil pesos al intentar hacer una transaccion que deje por debajo de este monto se rechazara
    
    public CuentaAhorro(int numeroCuenta, Persona titular, double saldoInicial) {
        // super pasa los datos al constructor de cuentaBancaria
        super(numeroCuenta, titular, saldoInicial, "Ahorro");
    }
    
    @Override
    public void retirarMonto(double monto){
        if(retirosMesMax > 0){
            retirosMesMax = retirosMesMax - 1;
            saldo = saldo - monto;
        }else{
            System.out.println("Limite del mes alcanzado se le ha cobrado una comision del 2% equivalente a: " + (monto * 0.02));
            saldo = saldo - (monto + (monto * 0.02));
        }
    }
    
    @Override
    public boolean confirmarRetiro(double monto){
        if ((saldo - monto) < 20000 ){
            return false;
        }else
        {
            return true;
        }
    }
    
    public void calcularBono(){
    
    }
}
