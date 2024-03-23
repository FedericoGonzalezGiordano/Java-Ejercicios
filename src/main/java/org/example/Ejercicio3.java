package org.example;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingrese una opcion: \n" +
                    "OPCION 1: CALCULAR EL TOTAL DE LA FACTURA \n"+
                    "OPCION 2: SALIR"
            );
            opcion=scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el precio de los 3 articulos");
                    System.out.println("1er articulo:");
                    double articuloUprecio=scanner.nextDouble();
                    System.out.println("2ndo articulo:");
                    double articuloDprecio=scanner.nextDouble();
                    System.out.println("3er articulo:");
                    double articuloTprecio=scanner.nextDouble();
                    System.out.println("Ahora ingrese la cantidad de stock de cada articulo");
                    System.out.println("1er articulo:");
                    int  articuloUcant=scanner.nextInt();
                    System.out.println("2ndo articulo:");
                    int  articuloDcant=scanner.nextInt();
                    System.out.println("3er articulo:");
                    int articuloTcant=scanner.nextInt();
                    double precioTotal=(articuloUprecio*articuloUcant)+(articuloDprecio*articuloDcant)+(articuloTprecio*articuloTcant);
                    System.out.println("El precio total de la factura es :"+precioTotal);
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
