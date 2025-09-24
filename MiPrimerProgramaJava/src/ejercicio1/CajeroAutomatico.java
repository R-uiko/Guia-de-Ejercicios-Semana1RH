/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author  Rodrigo Enrique Herrera Solorzano 256423
 */
public class CajeroAutomatico {
     public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    double saldo = 500.00;
    int opcion;
    
     do {
         System.out.println("==================================");
         System.out.println("        Cajero Automatico         ");
         System.out.println("1. Consultar saldo      ");
         System.out.println("2. Depositar dinero      ");
         System.out.println("3.  Retirar dinero      ");
         System.out.println("4. Salir      ");
         System.out.println("==================================");
         System.out.println("Seleccione una opcion");
         opcion = entrada.nextInt();
         
         switch(opcion) {
             case 1:
                 System.out.printf("Promedio: %.2f%n", saldo);
                 break;
                 
             case 2:
                 System.out.printf("Ingrese la coantidad a depositar : $ ");
                 double deposito = entrada.nextDouble();
                 if (deposito > 0) {
                     saldo += deposito;
                     System.out.printf("Deposito exitoso. Nuevo saldo actual: %.2f%n", saldo);
                 }else{
                     System.out.println("Cantidad invalida");}
                 break;             
              case 3:
                 System.out.printf("Ingrese la coantidad a retirar : $ ");
                 double retiro = entrada.nextDouble();
                 if (saldo > 0 && retiro <= saldo) {
                     saldo -= retiro;
                     System.out.printf("\nRetiro exitoso. Nuevo saldo actual: %.2f%n", saldo);
                 }else{
                     System.out.println("Cantidad invalida o fondo insuficiente");}
                 break;          
               case 4: 
                  System.out.println("Gracias por usar nuestro servicio");
                  break;
                  
                  default:
                   System.out.println("Seleccion invalidad");
                 
            }
            System.out.println(" ");
         } while (opcion != 4);
    }
}    

