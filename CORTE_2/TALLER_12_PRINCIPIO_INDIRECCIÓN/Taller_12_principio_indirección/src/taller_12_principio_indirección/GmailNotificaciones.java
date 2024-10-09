/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_12_principio_indirección;

/**
 *
 * @author juanm
 */
public class GmailNotificaciones {
    
    public class GmailNotificaciones implements ServicioNotificaciones {
        
    @Override
    public Correo crear(Usuario usuario) {
        // Lógica para crear correo
        return new Correo("Gmail", usuario.getNombre(), usuario.getIdentificacion());
    }
}
}
