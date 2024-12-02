/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_3;

/**
 *
 * @author juanm
 */
public class Main {
    public static void main(String[] args) {
        // Sistema antiguo
        SistemaAntiguoPago sistemaAntiguo = new SistemaAntiguoPago();
        AdaptadorSistemaPago adaptador = new AdaptadorSistemaPago(sistemaAntiguo);

        // Nuevo sistema de pago
        NuevoSistemaPago nuevoSistema = new NuevoSistemaPago();
        nuevoSistema.setNombre("Juan Martín Suarez");
        nuevoSistema.setCorreo("juanm.suarezh@autonoma.edu.co");
        nuevoSistema.setIdentificacion("1193542709");

        // Usando el adaptador
        adaptador.crearSesion(nuevoSistema);
        adaptador.validarCorreo(nuevoSistema);
        adaptador.ValidarAutorizacion();
        adaptador.realizarPago();
    }
}