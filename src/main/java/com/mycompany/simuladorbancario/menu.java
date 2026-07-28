/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorbancario;

import java.util.Scanner;

/**
 *
 * @author Johan
 */
public class menu {
    Scanner sc = new Scanner(System.in);
    gestorDeCuentas gC = new gestorDeCuentas();
    
    public void mainMenu(){
        int menu;
        char continuar = 's';
        //DEBUG
        gC.Debug();
        //FIN DEBUG
        do{
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\n----------SIMULADOR BANCARIO----------\n");
            System.out.println("1 - Crear una nueva cuenta");
            System.out.println("2 - Registrar depositos");
            System.out.println("3 - Registrar retiros");
            System.out.println("4 - Consultar cuentas y saldos");
            System.out.println("5 - Cerrar una cuenta");
            System.out.println("6 - Salir del sistema");
            System.out.print("\nIngresa la opcion que desea usar:\n>>");
            menu = sc.nextInt();
            sc.nextLine();
            switch(menu){
                case 1:
                    while(continuar == 's'){
                        crearCuenta();
                        System.out.print("\nDesea crear otra cuenta(si||no)? \n>>");
                        continuar = sc.next().toLowerCase().charAt(0);
                    }
                    continuar = 's';
                break;
                case 2:
                    registrarDeposito();
                break;
                case 3:
                    registrarRetiro();
                break;
                case 4:
                    consultarCuentas();
                break;
                case 5:
                    cerrarCuentas();
                break;
                case 6:
                break;
                default:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Opcion no valida!! Presiona ENTER para volver al menu principal");
                    sc.nextLine();
                break;
            }
        }while(menu != 6);
    }
    //1
    public void crearCuenta(){
        char menuCrear;
        
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n-----------CREAR UNA CUENTA-----------\n");
        System.out.println("a - Cuenta ahorro");
        System.out.println("b - Cuenta corriente");
        System.out.println("c - Cuenta empresarial");
        System.out.print("\nIngresa que tipo de cuenta desea crear:\n>>");
        menuCrear = sc.next().toLowerCase().charAt(0);
        
        
        switch(menuCrear){
            case 'a':
                gC.crearCuentaAhorro();
            break;
            case 'b':
                gC.crearCuentaCorriente();
            break;
            case 'c':
                gC.crearCuentaEmpresarial();
            break;
            default:
                System.out.println("Opcion no valida!!");
            break;
        }
    }
    
    //2
    public void registrarDeposito(){
        gC.DepositarYBuscarCuenta();
    }
    
    //3
    public void registrarRetiro(){
        gC.RetirarYBuscarCuenta();
    }
    
    //4
    public void consultarCuentas(){
        gC.consultarCuentasCreadas();
        System.out.print("Presiona ENTER para regresar al menu principal...");
        sc.nextLine();
    }
    
    //5
    public void cerrarCuentas(){
        gC.CerrarCuenta();
    }
}
