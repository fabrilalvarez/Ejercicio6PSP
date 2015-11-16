/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6psp;

/**
 *
 * @author oracle
 */
public class Caja {

    public static float capital;

    public Caja() {
    }

    public Caja(float capital) {
        Caja.capital = capital;
    }

    public static void setCapital(float capital) {
        Caja.capital = capital;
    }

    public static float getCapital() {
        return capital;
    }

}
