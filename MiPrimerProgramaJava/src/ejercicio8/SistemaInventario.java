/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import java.util.Scanner;
//esto para el orden
import java.util.ArrayList;

/**
 *
 * @author VirY
 */
public class SistemaInventario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Producto> inventario = new ArrayList<>();
        int opcion;

        do {
            System.out.println("==================================");
            System.out.println("        Sistema de Inventario     ");
            System.out.println("==================================");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Calcular valor total");
            System.out.println("4. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    
                    entrada.nextLine(); //limpiar buffer
                    
                    String nombre = entrada.nextLine();
                    System.out.print("Precio: $");
                    double precio = entrada.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = entrada.nextInt();
                    inventario.add(new Producto(nombre, precio, cantidad));
                    System.out.println("Producto registrado exitosamente.");
                    break;

                case 2:
                    System.out.println("--- Lista de Productos ---");
                    if (inventario.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        for (Producto p : inventario) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Producto p : inventario) {
                        total += p.precio * p.cantidad;
                    }
                    System.out.printf("Valor total del inventario: $%.2f%n", total);
                    break;

                case 4:
                    System.out.println("Gracias por usar el sistema de inventario.");
                    break;

                default:
                    System.out.println("Selección inválida.");
            }
            System.out.println(" ");
        } while (opcion != 4);

        entrada.close();
    }
}

// para no hacer otro archivo de clase mejor aqui
class Producto {
    String nombre;
    double precio;
    int cantidad;

    Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return String.format("%s | Precio: $%.2f | Cantidad: %d", nombre, precio, cantidad);
    }
}
