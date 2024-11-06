
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanm
 */
public class Orden {
    private  List<Computadora> computadoras;
    private FabricaComputadoras fabrica = new FabricaComputadoras();

    public Orden() {
        this.computadoras = new ArrayList<>();
    }

    public void agregarComputadora(String procesador, String tarjetaGrafica, int ram) {
        Computadora computadora = fabrica.crearComputadora(procesador, tarjetaGrafica, ram);
        computadoras.add(computadora);
    }

    public void mostrarComputadoras() {
        for (Computadora comp : computadoras) {
            System.out.println("Procesador: " + comp.getProcesador() + ", Tarjeta Gráfica: " + comp.getTarjetaGrafica() + ", RAM: " + comp.getRam() + "GB");
        }
    }
}