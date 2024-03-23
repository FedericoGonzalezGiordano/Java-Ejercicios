package org.example;
import java.util.Scanner;
/*6. Ingresar un año e indicar si ese año es bisiesto. Un año es bisiesto si es
múltiplo de 4 y no es múltiplo de 100 o si es múltiplo de 400

 */
public class Ejercicio6 {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int opcion;

            do {
                System.out.println("Ingrese una opccion: \n" +
                        "Opcion 1: Indicar si el año es bisiesto\n"+
                        "Opcion 2:Salir");
                opcion=scanner.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el año");
                        int año=scanner.nextInt();
                        if ((año%4==0 && año%100 !=0) || año%400==0){
                            System.out.println("El año es bisiesto");
                        }else
                            System.out.println("El año no es bisiesto");
                        break;
                    case 2:
                        System.out.println("Saliendo..");
                        break;
                    default:System.out.println("Opcion invalida");
                }
            }while (opcion!=2);
            System.out.println("Programa finalizado");
    }
}
