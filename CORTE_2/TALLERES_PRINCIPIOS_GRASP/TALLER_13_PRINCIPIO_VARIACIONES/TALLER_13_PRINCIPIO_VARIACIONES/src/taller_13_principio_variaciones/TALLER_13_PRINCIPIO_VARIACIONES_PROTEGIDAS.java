/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_13_principio_variaciones_protegidas;

/**
 *
 * @author juanm
 */
public class TALLER_13_PRINCIPIO_VARIACIONES_PROTEGIDAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notificacion notificacion = new Notificacion("Bienvenida", "Hola, bienvenido a nuestro servicio!");

        // Enviar notificación por correo electrónico
        Notificador notificador = new Notificador(new CanalCorreoElectronico());
        notificador.notificar(notificacion);

        // Cambiar a envío por SMS
        notificador.setCanal(new CanalSMS());
        notificador.notificar(notificacion);

        // Cambiar a envío por WhatsApp
        notificador.setCanal(new CanalWhatsapp());
        notificador.notificar(notificacion);
    }
    
}
