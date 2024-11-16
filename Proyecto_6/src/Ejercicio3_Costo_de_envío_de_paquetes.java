/**
 * Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según
 * la región y el peso del paquete. Si el peso es menor de 5 kg y la región es 
 * "local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para 
 * la región "nacional". Para cualquier otro caso, el costo es de $15.
 */
import java.util.Scanner;
public class Ejercicio3_Costo_de_envío_de_paquetes {
    public static void main(String[] args) {
        double peso, costoEnvio;
        String region;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el peso del paquete (kg): ");
        peso = tcl.nextDouble();
        System.out.print("Ingrese la región de envío (local/nacional): ");
        region =tcl.next();
        if (peso < 5 && region.equalsIgnoreCase("local")) {
            costoEnvio = 5.0;
        } else if (peso >= 5 && peso <= 10 && region.equalsIgnoreCase("nacional")) {
            costoEnvio = 10.0; 
        } else {
            costoEnvio = 15.0; 
        }
        System.out.println("El costo de envío es: $" + costoEnvio);
    }
   
}
/***
 * Ingrese el peso del paquete (kg): 4
 * Ingrese la región de envío (local/nacional): local
 * El costo de envío es: $5.0
 * ************************************************************
 * Ingrese el peso del paquete (kg): 5
 * Ingrese la región de envío (local/nacional): nacional
 * El costo de envío es: $10.0
 * 
 */