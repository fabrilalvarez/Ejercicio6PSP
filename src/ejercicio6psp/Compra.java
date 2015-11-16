/**
 * Uno simulará el ingreso, con la compra de artículos por parte de clientes
 */
package ejercicio6psp;

public class Compra extends Thread {

    private String nombreCliente;
    private float precio;
    public static Caja c;

    public Compra() {
    }

    public Compra(Caja c, String nombreCliente, float precio) {
        super("compra");
        this.nombreCliente = nombreCliente;
        this.precio = precio;
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Dinero en la caja al inicio de la compra " + c.getCapital());
        synchronized (c) {//Sincronizamos la Caja
            c.setCapital(c.getCapital() + precio);
            System.out.println(nombreCliente + " ha pagado " + precio + " €");
            System.out.println("Dinero en la caja al final de la compra " + c.getCapital());
            notify();//Como ya ha pagado notificamos
        }

    }

}
