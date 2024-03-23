package org.example;
import java.util.Scanner;
/*
7. Una empresa de alquiler de autos cobra $300 por día si no se superan los 200
km de uso diario. Por cada km extra hasta los 1000 km cobra $5 adicionales,
y a partir de los 1000 cobra $10 adicionales. Hacer un programa que solicite
la cantidad de km realizados por un cliente e indique el importe que se le debe
cobrar.

 */

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opcion;

        do {

            System.out.println("Opcion 1 : Calcular el importe a pagar\n+" +
                                "Opcion 2: Salir");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    double precioPorDia=300;
                    double kmLimit=200;

                    System.out.println("Ingrese la cantidad de km realizados");
                    Scanner scaner=new Scanner(System.in);
                    double kmHechos=scanner.nextDouble();
                    if (kmHechos<=kmLimit){
                        System.out.println("El importe a pagar es de : "+precioPorDia);
                    }
                    else if (kmHechos<1000){
                        double kmSobrepasados= kmHechos-kmLimit;
                        double importePago= precioPorDia+(kmSobrepasados *5);
                        System.out.println("El importe a pagar es de : "+importePago);
                    }
                    else {
                        double kmSobrepasados = kmHechos - kmLimit;
                        double importePago = precioPorDia + (kmSobrepasados * 10);
                        System.out.println("El importe a pagar es de : " + importePago);

                    }
                    break;
                case 2:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Opcion invalida..");
            }
        }while (opcion!=2);

        System.out.println("Programa cerrado");




    }
}
