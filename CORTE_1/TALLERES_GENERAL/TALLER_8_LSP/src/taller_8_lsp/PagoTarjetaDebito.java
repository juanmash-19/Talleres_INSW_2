/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_8_lsp;

/**
 *
 * @author juanm
 */
public class PagoTarjetaDebito implements Pago {
    private String numeroTarjeta;
    private double monto;

    public PagoTarjetaDebito(String numeroTarjeta, double monto) {
        this.numeroTarjeta = numeroTarjeta;
        this.monto = monto;
    }

    @Override
    public void procesarPago() {
        // Lógica para procesar pago con tarjeta de débito
        System.out.println("Procesando pago con tarjeta de débito: " + numeroTarjeta + " por monto: " + monto);
    }
}
