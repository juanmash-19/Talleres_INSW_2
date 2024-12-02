/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_4;

/**
 *
 * @author juanm
 */
public class Configuracion {
    private static Configuracion instancia; 
    private String url;
    private String usuario;
    private String contraseña;

    private Configuracion() {
        this.url = "http://localhost:3000";
        this.usuario = "juanm";
        this.contraseña = "hola1234";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
}

