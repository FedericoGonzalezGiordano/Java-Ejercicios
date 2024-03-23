package org.example;
import java.util.Scanner;

/*5. Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que
cobra por hora. Indique el total a cobrar teniendo en cuenta que si trabajó más
de 180 horas las excedentes las cobra con un 50 % de aumento.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingrese una opcion:\n"+
                    "OPCION 1: Calcular el total a cobrar\n"+
                    "OPCION 2: Salir");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad de horas trabajadas");
                    double cantHorasT=scanner.nextDouble();
                    System.out.println("Ingrese el sueldo que cobra  por horas trabajada");
                    double sueldoXhr =scanner.nextDouble();
                    double totalAcobrar=cantHorasT*sueldoXhr;
                    if (cantHorasT>180){
                        totalAcobrar=totalAcobrar*1.50;
                        System.out.println("El total a cobrar es de:" +totalAcobrar);
                    }
                    else
                       System.out.println("El total a cobrar es de:"+totalAcobrar);
                    break;
                case 2:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;

            }
        }
        while (opcion!=2);
        System.out.println("Programa finalizado");
    }
}
