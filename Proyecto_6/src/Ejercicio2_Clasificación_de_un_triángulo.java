/**
 * Clasificación de un triángulo Dado tres valores que representan las longitudes 
 * de los lados de un triángulo, determinar su tipo. Las reglas son:

 * Si todos los lados son iguales, mostrar "Triángulo equilátero".
 * Si dos lados son iguales, mostrar "Triángulo isósceles".
 * Si todos los lados son diferentes, mostrar "Triángulo escaleno".
 * Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".
 *
 */
import java.util.Scanner;
public class Ejercicio2_Clasificación_de_un_triángulo {
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado 1: ");
        lado1 =tcl.nextDouble();
        System.out.print("Ingrese la longitud del lado 2: ");
        lado2 =tcl.nextDouble();
        System.out.print("Ingrese la longitud del lado 3: ");
        lado3 =tcl.nextDouble();
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triángulo equilátero"); 
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triángulo isósceles");
            } else {
                System.out.println("Triángulo escaleno"); 
            }
        } else {
            System.out.println("No es un triángulo");
        }
    }
    
}
/***
 * Ingrese la longitud del lado 1: 2
 * Ingrese la longitud del lado 2: 2
 * Ingrese la longitud del lado 3: 2
 * Triángulo equilátero
 * ****************************************************
 * Ingrese la longitud del lado 1: 2
 * Ingrese la longitud del lado 2: 2
 * Ingrese la longitud del lado 3: 3
 * Triángulo isósceles
 * ****************************************************
 * Ingrese la longitud del lado 1: 6
 * Ingrese la longitud del lado 2: 5
 * Ingrese la longitud del lado 3: 4
 * Triángulo escaleno
 * ****************************************************
 * Ingrese la longitud del lado 1: 5
 * Ingrese la longitud del lado 2: 7
 * Ingrese la longitud del lado 3: 1
 * No es un triángulo
 */