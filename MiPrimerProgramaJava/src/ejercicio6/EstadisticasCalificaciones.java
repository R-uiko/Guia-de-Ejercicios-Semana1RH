/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Scanner;

/**
 *
 * @author VirY
 */
public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   Estadísticas de Calificaciones ");
        System.out.println("==================================");
        System.out.print("Ingrese el número de estudiantes: ");
        int n = entrada.nextInt();

        double[] notas = new double[n];
        double suma = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.printf("Nota del estudiante %d: ", (i + 1));
            notas[i] = entrada.nextDouble();
            suma += notas[i];
            if (notas[i] > max) max = notas[i];
            if (notas[i] < min) min = notas[i];
        }

        double promedio = suma / n;

        System.out.printf("Promedio general: %.2f%n", promedio);
        System.out.printf("Nota más alta: %.2f%n", max);
        System.out.printf("Nota más baja: %.2f%n", min);

        entrada.close();
    }
}