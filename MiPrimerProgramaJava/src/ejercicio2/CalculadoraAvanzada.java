/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Enrique Herrera Solorzano 256423
 */
public class CalculadoraAvanzada {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==================================");
            System.out.println("       Calculadora Avanzada       ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            double a, b;

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    b = entrada.nextDouble();
                    System.out.printf("Resultado: %.2f%n", (a + b));
                    break;

                case 2:
                    System.out.print("Ingrese el primer número: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    b = entrada.nextDouble();
                    System.out.printf("Resultado: %.2f%n", (a - b));
                    break;

                case 3:
                    System.out.print("Ingrese el primer número: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    b = entrada.nextDouble();
                    System.out.printf("Resultado: %.2f%n", (a * b));
                    break;

                case 4:
                    System.out.print("Ingrese el dividendo: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingrese el divisor: ");
                    b = entrada.nextDouble();
                    if (b != 0) {
                        System.out.printf("Resultado: %.2f%n", (a / b));
                    } else {
                        System.out.println("Error: no se puede dividir entre 0.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese la base: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    b = entrada.nextDouble();
                    System.out.printf("Resultado: %.2f%n", Math.pow(a, b));
                    break;

                case 6:
                    System.out.print("Ingrese el número: ");
                    a = entrada.nextDouble();
                    if (a >= 0) {
                        System.out.printf("Resultado: %.2f%n", Math.sqrt(a));
                    } else {
                        System.out.println("Error: no se puede calcular la raíz de un número negativo.");
                    }
                    break;

                case 7:
                    System.out.println("Gracias por usar la calculadora.");
                    break;

                default:
                    System.out.println("Selección inválida.");
            }
            System.out.println(" ");
        } while (opcion != 7);

        entrada.close();
    }
}
