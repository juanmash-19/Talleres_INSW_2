/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_12_principio_indirección;

/**
 *
 * @author juanm
 */
public class OutlookNotificaciones implements ServicioNotificaciones {
    
    @Override
    public Correo crear(Usuario usuario) {
        // Lógica para crear correo 
        return new Correo("Outlook", usuario.getNombre(), usuario.getIdentificacion());
    }
}
