/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jercicio5;
import java.util.Scanner;

/**
 *
 * @author VirY
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("            Factorial             ");
        System.out.println("==================================");
        System.out.print("Ingrese un número: ");
        int n = entrada.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.printf("El factorial de %d es: %d%n", n, factorial);

        entrada.close();
    }
}
