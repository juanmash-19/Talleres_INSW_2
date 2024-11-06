/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_13_principio_variaciones_protegidas;

/**
 *
 * @author juanm
 */
public class Notificador {
    private CanalNotificacion canal;

    public Notificador(CanalNotificacion canal) {
        this.canal = canal;
    }

    public void notificar(Notificacion notificacion) {
        canal.enviar(notificacion);
    }

    public void setCanal(CanalNotificacion canal) {
        this.canal = canal;
    }
}
