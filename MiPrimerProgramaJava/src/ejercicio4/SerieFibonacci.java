/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author VirY
 */
public class SerieFibonacci {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("        Serie Fibonacci           ");
        System.out.println("==================================");
        System.out.print("Ingrese la cantidad de términos: ");
        int n = entrada.nextInt();

        int a = 0, b = 1;

        System.out.print("Serie: ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", a);
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
           //para que se cierre bien
        entrada.close();
    }
}
