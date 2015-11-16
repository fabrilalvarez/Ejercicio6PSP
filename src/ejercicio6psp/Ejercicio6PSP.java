/**
 * Simular una caja de una empresa con dos hilos. Uno simulará el ingreso, con
 * la compra de artículos por parte de clientes y el otro la extracción de
 * dinero de la caja con el pago a proveedores. La cuenta tendrá un capital
 * inicial. Realizar 10 ingresos y 5 extracciones.
 */
package ejercicio6psp;

/**
 *
 * @author oracle
 */
public class Ejercicio6PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja cajero = new Caja(0);
        Compra franCompra = new Compra(cajero, "Fran", 5);
        Venta franVende = new Venta(cajero, "Sergio", 4);
        franCompra.start();
        franVende.start();
    }

}
