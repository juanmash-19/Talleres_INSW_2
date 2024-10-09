/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_12_principio_indirección;

/**
 *
 * @author juanm
 */
public class Usuario {
    private String nombre;
    private String identificacion;
    private ServicioNotificaciones servicioNotificaciones;

    public Usuario(String nombre, String identificacion, ServicioNotificaciones servicioNotificaciones) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.servicioNotificaciones = servicioNotificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void generarCorreo() {
        Correo correo = servicioNotificaciones.crear(this);
        System.out.println("Correo generado con el servicio: " + correo.getServicio());
    }
}
