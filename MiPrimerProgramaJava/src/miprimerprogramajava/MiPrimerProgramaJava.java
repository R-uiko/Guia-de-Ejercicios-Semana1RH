/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerprogramajava;

import java.util.Scanner;

public class MiPrimerProgramaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nombre;
        
        System.out.print("ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();
        
        double suma = 0;
        int contadora = 0;
        
        //buble que pide 3 notas
        for( int i = 1; i<= 3; i++ ){
            System.out.println("ingerese la nota " + i + ":");
            suma += entrada.nextDouble();
            
            contadora++;
        }
        
       double promedio = suma / contadora;
        
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Hello, World!"); // Prints the message to the console
        
        if (promedio >=7) {
            System.out.println("\n" + nombre + " esta APROBADO");
        }else{
            System.out.println(nombre + " esta REPROBADO");
        }
        
    }
    
}
