package org.example;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingrese una opcion: \n" +
                    "Opcion 1: Calcular la persona que tiene mayor altura\n" +
                    "Opcion 2: Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la persona 1");
                    scanner.nextLine();
                    String nombre1 = scanner.nextLine();
                    System.out.println("Ingrese la altura de la persona 1");
                    double altura1 = scanner.nextDouble();
                    System.out.println("Ingrese el nombre de la persona 2");
                    scanner.nextLine();
                    String nombre2 = scanner.nextLine();
                    System.out.println("Ingrese la altura de la persona 2");
                    double altura2 = scanner.nextDouble();

                    if (altura1 > altura2) {
                        System.out.println(nombre1 + " es la persona mas alta");
                    } else if (altura2 > altura1) {
                        System.out.println(nombre2 + " es la persona mas alta");
                    } else {
                        System.out.println("Ambas personas miden lo mismo");
                    }
                    break;
                case 2:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 2);

        System.out.println("Programa finalizado");
    }
}
