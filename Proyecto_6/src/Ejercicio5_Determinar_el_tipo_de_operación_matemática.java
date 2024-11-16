/**
 * Determinar el tipo de operación matemática. Dado un número del 1 al 4 que representa una
 * operación matemática básica (suma, resta, multiplicación, división), muestra el nombre 
 * de la operación correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; 
 * si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 */
import java.util.Scanner;
public class Ejercicio5_Determinar_el_tipo_de_operación_matemática {
    public static void main(String[] args) {
        int numeroOperacion;
        String nombreOperacion;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 4 para determinar la operación matemática: ");
        numeroOperacion =tcl.nextInt();
        switch (numeroOperacion) {
            case 1:
                nombreOperacion = "Suma";
                break;
            case 2:
                nombreOperacion = "Resta";
                break;
            case 3:
                nombreOperacion = "Multiplicación";
                break;
            case 4:
                nombreOperacion = "División";
                break;
            default:
                nombreOperacion = "Operación inválida";
        }
        System.out.println("La operación correspondiente es: " + nombreOperacion);

    }
}
/***
 * Ingrese un número del 1 al 4 para determinar la operación matemática: 1
 * La operación correspondiente es: Suma
 * ***************************************************************************
 * Ingrese un número del 1 al 4 para determinar la operación matemática: 5
 * La operación correspondiente es: Operación inválida
 */