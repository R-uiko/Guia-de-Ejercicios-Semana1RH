/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Enrique Herrera Solorzano 256423
 */
public class NumerosPrimos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("         Numeros Primos           ");
        System.out.println("==================================");
        System.out.print("Ingrese un número: ");
        int num = entrada.nextInt();

        boolean esPrimo = true;

        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.printf("%d es un número primo.%n", num);
        } else {
            System.out.printf("%d NO es un número primo.%n", num);
        }

        entrada.close();
    }
}
