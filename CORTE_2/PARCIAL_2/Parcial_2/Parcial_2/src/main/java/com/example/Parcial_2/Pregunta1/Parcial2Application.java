package com.example.Parcial_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootApplication
public class Parcial2Application {

	public static void main(String[] args) {
				// Creamos productos y calculamos precios
				Producto producto = new Producto(100.0);
				System.out.println("Precio con impuestos: " + producto.calcularImpuesto());
				System.out.println("Precio con descuento e impuestos: " + producto.calcularPrecioFinal(0.1));

				// Creamos la librería y agregamos los libros
				Libreria libreria = new Libreria();
				libreria.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", 50.0, 1605));
				libreria.agregarLibro(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 40.0, 1967));

				// Buscamos los libros
				Libro libro = libreria.buscarPorTitulo("El Quijote");
				if (libro != null) {
					System.out.print("Buscando libro por nombre");

	}

}
