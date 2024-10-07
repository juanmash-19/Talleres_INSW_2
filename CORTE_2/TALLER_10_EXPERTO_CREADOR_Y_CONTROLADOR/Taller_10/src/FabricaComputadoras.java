/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author juanm
 */
public class FabricaComputadoras {
    public Computadora crearComputadora(String procesador, String tarjetaGrafica, int ram) {
        return new Computadora(procesador, tarjetaGrafica, ram);
    }
}
