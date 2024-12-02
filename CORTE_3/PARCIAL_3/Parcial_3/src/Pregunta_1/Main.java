/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pregunta_1;

/**
 *
 * @author juanm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnvioFactory envioExpress = new EnvioExpressFactory();
        ServicioEnvio servicioExpress = envioExpress.crearServicioEnvio();
        servicioExpress.enviarPaquete("Electrodomesticos");

        EnvioFactory envioRegular = new EnvioRegularFactory();
        ServicioEnvio servicioRegular = envioRegular.crearServicioEnvio();
        servicioRegular.enviarPaquete("Tennis y ropa");
    }
}
