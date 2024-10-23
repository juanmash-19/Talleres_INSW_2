/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_13_principio_variaciones_protegidas;

/**
 *
 * @author juanm
 */
public class CanalWhatsapp implements CanalNotificacion {
    @Override
    public void enviar(Notificacion notificacion) {
        System.out.println("Enviando WhatsApp: " + notificacion.getTitulo() + " - " + notificacion.getCuerpo());
    }
}