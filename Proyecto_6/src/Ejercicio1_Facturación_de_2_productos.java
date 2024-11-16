/*Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas
Informáticos para programar su sistema de compras online, el cual calcule el precio total de la 
compra para un cliente. Para ello, se necesita utilizar estructuras secuenciales y de selección 
(if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.
Requisitos:
La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío del
paquete, del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción descrita en el punto 3.b.
El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos,
monto final dadas las siguientes condiciones: a. Si el subtotal de la compra (sin descuentos o
gastos de envío), supera los $1000, se le otorga un 20% de descuento; y si es al menos los $1000 
el descuento es como mínimo 5%. b. Adicional, si la compra es mayor a $5000, el envío será gratuito. 
c. El IVA del 10% se debe aplicar a todos los artículos antes de agregar cualquier tipo de descuesto o promoción
 */
import java.util.Scanner;
public class Ejercicio1_Facturación_de_2_productos {
    public static void main(String[] args) {
        int cantidadProducto1,cantidadProducto2;
        double precioProducto1 = 300.0, precioProducto2 = 700.0, subtotaliva, totalConIva, iva, descuento,costoEnvio;
        double totalFinal,subtotal;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Producto 1 (Precio: $300): ");
        cantidadProducto1 =tcl.nextInt();
        System.out.print("Ingrese la cantidad de Producto 2 (Precio: $700): ");
        cantidadProducto2 =tcl.nextInt();
        subtotal = (cantidadProducto1 * precioProducto1) + (cantidadProducto2 * precioProducto2);
        iva = subtotal * 0.10;
        totalConIva = subtotal + iva;
        if (subtotal > 1000) {
            descuento = totalConIva * 0.20; 
        } else if (subtotal >= 1000) {
            descuento = 5.0;
            costoEnvio = 50.0;
        if (subtotal > 5000) {
             costoEnvio = 0.0;
        }
        totalFinal = totalConIva - descuento + costoEnvio;
        System.out.println("Detalles de la compra: ");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA (10%): " + iva);
        System.out.println("Descuento: " + descuento);
        System.out.println("Costo de envío: " + costoEnvio);
        System.out.println("Total final: " + totalFinal);
    }
    }
}
/***
 * Ingrese la cantidad de Producto 1 (Precio: $300): 1
 * Ingrese la cantidad de Producto 2 (Precio: $700): 1
 * Detalles de la compra: Subtotal: 1000.0
 * IVA (10%): 100.0
 * Descuento: 5.0
 * Costo de envío: 50.0
 * Total final: 1145.0
 * 
 * me rrompi la cabeza con este ejrcicio licen 
 */

