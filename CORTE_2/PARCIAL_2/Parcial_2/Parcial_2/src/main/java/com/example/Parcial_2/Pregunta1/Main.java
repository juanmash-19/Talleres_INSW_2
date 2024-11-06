package Pregunta1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
      
        Libreria libreria = new Libreria();

        // Añadir libros
        libreria.anadirLibro(new Libro("El Quijote", "Miguel de Cervantes", 15.5, 1605));
        libreria.anadirLibro(new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 20.0, 1967));
        libreria.anadirLibro(new Libro("Don Juan Tenorio", "José Zorrilla", 10.0, 1844));

        // Buscar libros por título
        System.out.println("Buscar por título 'El Quijote': " + libreria.buscarLibroPorTitulo("El Quijote"));

        // Buscar libros por autor
        System.out.println("Buscar libros por autor 'Gabriel Garcia Marquez': " + libreria.buscarLibrosPorAutor("Gabriel Garcia Marquez"));

        // Obtener libros por precios
        System.out.println("Libros entre precios 10 y 20: " + libreria.obtenerLibrosEntrePrecios(10, 20));

        // Obtener libros por año
        System.out.println("Libros del año 1605: " + libreria.obtenerLibrosPorAnio(1605));

        Orden orden = new Orden();

        // Calculamos el total con impuesto para un precio dado
        double precio = 100.0;
        double totalConImpuesto = orden.calcularTotalConImpuesto(precio);
        System.out.println("Total con impuesto para el precio " + precio + ": " + totalConImpuesto);

        // Calculamos el total con descuento e impuesto
        double descuento = 20.0;
        double totalConDescuento = orden.calcularDescuentoTotal(precio, descuento);
        System.out.println("Total con descuento e impuesto para el precio " + precio + " y descuento " + descuento + ": " + totalConDescuento);

        OrdenEstado ordenEstado = new OrdenEstado();

        int[] ordenIds = {-1, 0, 10, 60, 150};
        for (int id : ordenIds) {
            String estado = ordenEstado.obtenerEstado(id);
            System.out.println("Estado de la orden con ID " + id + ": " + estado);
        }
    }
}
