/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_8_isp;

/**
 *
 * @author juanm
 */
public class Vehiculo implements TransporteVehiculo {
    
    @Override
    public String obtenerMarca() {
        // Lógica para obtener la marca del automóvil
        return "Toyota";
    }
    
    @Override
    public String obtenerModelo() {
        // Lógica para obtener el modelo del automóvil
        return "Corolla";
    }

    @Override
    public void comprarSoat() {
        // Lógica para comprar SOAT del automóvil
        System.out.println("SOAT comprado para el Automovil.");
    }

    @Override
    public void comprarTecnicoMecanica() {
        // Lógica para comprar la Técnico-Mecánica del automóvil
        System.out.println("Revisión Técnico-Mecánica comprada para el Automovil.");
    }
}
