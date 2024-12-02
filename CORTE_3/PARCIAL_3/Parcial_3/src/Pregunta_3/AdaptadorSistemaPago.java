/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_3;

/**
 *
 * @author juanm
 */
public class AdaptadorSistemaPago extends NuevoSistemaPagoOperacion {
    private final SistemaAntiguoPago sistemaAntiguo;

    public AdaptadorSistemaPago(SistemaAntiguoPago sistemaAntiguo) {
        this.sistemaAntiguo = sistemaAntiguo;
    }

    @Override
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago) {
        sistemaAntiguo.iniciarSesion(nuevoSistemaPago.getNombre());
    }

    @Override
    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago) {
        sistemaAntiguo.comprobarCorreo(nuevoSistemaPago.getCorreo());
    }

    @Override
    public void ValidarAutorizacion() {
        sistemaAntiguo.autorizarPago();
    }

    @Override
    public void realizarPago() {
        sistemaAntiguo.ejecutarPago();
    }
}