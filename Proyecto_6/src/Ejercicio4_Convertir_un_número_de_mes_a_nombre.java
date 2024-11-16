/**
 * Convertir un número de mes a nombre. Dado un número del 1 al 12, que representa un 
 * mes del año, muestra el nombre del mes correspondiente. Por ejemplo, si el usuario ingresa 1,
 * debe mostrar "Enero"; si ingresa 2, debe mostrar "Febrero", y así sucesivamente
 */
import java.util.Scanner;
public class Ejercicio4_Convertir_un_número_de_mes_a_nombre {
    public static void main(String[] args) {
        int numeroMes;
        String nombreMes;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 12 para obtener el mes correspondiente: ");
        numeroMes =tcl.nextInt();
        switch (numeroMes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Número inválido";
        }
            System.out.println("el mes correspondiente es: "+ nombreMes);

    }
   
}
/***
 * Ingrese un número del 1 al 12 para obtener el mes correspondiente: 3
 * el mes correspondiente es: Marzo 
 * *********************************************************************
 * Ingrese un número del 1 al 12 para obtener el mes correspondiente: 13
 * el mes correspondiente es: Número inválido
 */