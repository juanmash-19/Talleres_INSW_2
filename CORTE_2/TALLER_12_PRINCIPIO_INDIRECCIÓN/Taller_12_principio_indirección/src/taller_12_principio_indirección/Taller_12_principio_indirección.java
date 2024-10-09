/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_12_principio_indirección;

/**
 *
 * @author juanm
 */
public class Taller_12_principio_indirección {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioNotificaciones gmailService = new GmailNotificaciones();
        Usuario usuario = new Usuario("JuanM", "123456", gmailService);
        usuario.generarCorreo();
        
        ServicioNotificaciones outlookService = new OutlookNotificaciones();
        Usuario otroUsuario = new Usuario("Valeria", "654321", outlookService);
        otroUsuario.generarCorreo();
    }
}

