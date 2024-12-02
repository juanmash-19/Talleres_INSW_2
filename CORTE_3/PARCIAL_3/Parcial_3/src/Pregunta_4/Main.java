/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_4;

/**
 *
 * @author juanm
 */
public class Main {
    public static void main(String[] args) {
        Configuracion config = Configuracion.getInstancia();

        System.out.println("URL: " + config.getUrl());
        System.out.println("Usuario: " + config.getUsuario());
        System.out.println("Contraseña: " + config.getContraseña());
    }
}
