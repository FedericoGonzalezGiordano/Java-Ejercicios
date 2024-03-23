package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingrese un número");
            double numeroUno = scanner.nextDouble();
            System.out.println("Ingrese un segundo número");
            double numeroDos = scanner.nextDouble();

            System.out.println("Seleccione alguna de las siguientes opciones\n" +
                    "OPCION 1: SUMAR \n" +
                    "OPCION 2: RESTAR  \n" +
                    "OPCION 3: MULTIPLICAR \n" +
                    "OPCION 4: DIVIDIR \n" +
                    "OPCION 5: SALIR \n");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los dos números es: " + (numeroUno + numeroDos));
                    break;
                case 2:
                    System.out.println("La resta de los dos números es: " + (numeroUno - numeroDos));
                    break;
                case 3:
                    System.out.println("La multiplicación de los dos números es: " + (numeroUno * numeroDos));
                    break;
                case 4:
                    System.out.println("La división de los dos números es: " + (numeroUno / numeroDos));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 5);

        System.out.println("Programa finalizado.");
    }
}
