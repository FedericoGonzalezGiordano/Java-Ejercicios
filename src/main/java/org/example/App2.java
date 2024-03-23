package org.example;
import java.util.Scanner;
public class App2 {

        public static void main(String[] args)
        {
            System.out.println(
                    "Seleccione una opcion:\n"+
                    "Opcion 1: calcular el precio del articulo con IVA\n"+
                    "Opcion 2 :Salir"
            );
            Scanner scanner=new Scanner(System.in);
            int opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el precio del articulo a la venta");
                    Scanner scan=new Scanner(System.in);
                    double numeroIngresado= scanner.nextDouble();
                    double precioConIva=numeroIngresado*1.19;
                    System.out.println("El precio con un tasa fija de 19% es de: "+precioConIva);
                    break;
                case 2:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("Programa finalizado");

        }




}

