/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author juanm
 */
public class Carrito {
    private List<Libro> libros = new ArrayList<>();

    // Método para agregar libros al carrito
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para eliminar libros del carrito
    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    // Método para calcular el precio total
    public double calcularPrecioTotal() {
        double total = 0;
        for (Libro libro : libros) {
            total += libro.getPrecio();
        }
        return total;
    }
}
