/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
//el randon para randomizar 
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author VirY
 */
public class JuegoAdivinarNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //este random
        Random rand = new Random();

        int secreto = rand.nextInt(100) + 1;
        int intento, contador = 0;

        System.out.println("==================================");
        System.out.println("    Juego: Adivinar el Número     ");
        System.out.println("==================================");
        System.out.println("Adivina el número entre 1 y 100.");

        do {
            System.out.print("Tu número: ");
            intento = entrada.nextInt();
            contador++;

            if (intento > secreto) {
                System.out.println("Demasiado alto.");
            } else if (intento < secreto) {
                System.out.println("Demasiado bajo.");
            } else {
                System.out.printf("¡Felicidades! Lo lograste en %d intentos.%n", contador);
            }
        } while (intento != secreto);

        entrada.close();
    }
}