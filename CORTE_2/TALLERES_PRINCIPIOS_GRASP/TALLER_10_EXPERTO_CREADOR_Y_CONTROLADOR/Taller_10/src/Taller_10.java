/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author juanm
 */
public class Taller10 {
    public static void main(String[] args) {
        // Crear libros 
        Libro libro1 = new Libro("100añossoledad", "GabrielGM", "2", 19.89);
        Libro libro2 = new Libro("SinTnohayParaiso", "GustavoB", "13", 21.40);

        Carrito carrito = new Carrito();

        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);

        double total = carrito.calcularPrecioTotal();
        System.out.println("El precio total de los libros en el carrito es de " + total);

 
        carrito.eliminarLibro(libro2);
        total = carrito.calcularPrecioTotal();
        System.out.println("El precio total después de eliminar un libro es  de " + total);
        
          // Ejemplo computadoras
        Orden orden = new Orden();
        orden.agregarComputadora("intel i5", "gtx 1650", 24);
        orden.agregarComputadora("amd", "rx 560", 16);
        System.out.println("Computadoras compradas");
        orden.mostrarComputadoras();
        System.out.println();

        // Ejemplo de uso entradas
        Usuario usuario = new Usuario();
        System.out.println("Boletos  :  ");
        usuario.comprar("Cine");       
        usuario.comprar("Teatro");    
        usuario.comprar("Concierto");  
    }
}
