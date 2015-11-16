/**
 * la extracción de dinero de la caja con el pago a proveedores.
 */
package ejercicio6psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class Venta extends Thread {

    public String nombrePersona;
    public float dinero;
    public boolean bandera = true;
    public static Caja c;

    public Venta() {
    }

    public Venta(Caja c, String nombrePersona, float dinero) {
        super("venta");
        this.c = c;
        this.nombrePersona = nombrePersona;
        this.dinero = dinero;
    }

    @Override
    public void run() {
        System.out.println("Dinero en la caja al inicio de la venta " + c.getCapital());
        synchronized (c) {//Sincronizamos la caja
            if (c.getCapital() == 0) {//Si esta vacía
                try {
                    wait();//Esperamos
                } catch (InterruptedException ex) {
                    Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {//Caso contrario (Hay algo) entonces 
                c.setCapital(c.getCapital() - dinero);//Añadimos dinero
            }
            System.out.println(nombrePersona + " ha retirado " + dinero + " €");
            System.out.println("Dinero en la caja al final de la venta " + c.getCapital());
        }

    }
}
