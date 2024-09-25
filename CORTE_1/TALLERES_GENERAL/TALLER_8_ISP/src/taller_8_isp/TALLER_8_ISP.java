/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_8_isp;

/**
 *
 * @author juanm
 */
public class TALLER_8_ISP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancia de Vehiculo
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Vehiculo: " + vehiculo.obtenerMarca() + " " + vehiculo.obtenerModelo());
        vehiculo.comprarSoat();
        vehiculo.comprarTecnicoMecanica();
        // Crear instancia de Bicicleta
        Bicicleta bicicleta = new Bicicleta();
        System.out.println("Bicicleta: " + bicicleta.obtenerMarca() + " " + bicicleta.obtenerModelo());
    }
    
}
