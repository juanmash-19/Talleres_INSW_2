/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_8_lsp;

/**
 *
 * @author juanm
 */
public class TALLER_8_LSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Procesar un pago con tarjeta de crédito
        Pago pagoCredito = new PagoTarjetaCredito("1234-5678-9101-1121", 500.00);
        pagoCredito.procesarPago();

        // Procesar un pago con tarjeta de débito
        Pago pagoDebito = new PagoTarjetaDebito("9876-5432-1098-7654", 300.00);
        pagoDebito.procesarPago();
    }
    
}
