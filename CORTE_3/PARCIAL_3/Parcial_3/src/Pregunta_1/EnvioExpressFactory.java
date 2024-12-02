/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_1;

/**
 *
 * @author juanm
 */
public class EnvioExpressFactory implements EnvioFactory {
    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new ServicioEnvio() {
            @Override
            public void enviarPaquete(String paquete) {
                System.out.println("ENVIANDO EL PAQUETE DE FORMA EXPRESS");
            }
        };
    }
}