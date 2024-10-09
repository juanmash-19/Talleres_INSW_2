public class main {
    public static void main(String[] args) {
        // Crear los productos
        Producto producto1 = new Producto("Televisor", 1.800, 1);
        Producto producto2 = new Producto("Celular", 900.00, 2);
        Producto producto3 = new Producto("Teclado", 70.00, 3);
        // Agregar los productos a una lista
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        // Crear un cliente
        Cliente cliente = new Cliente("Juan_Suarez", "Avenida Santander");
        // Crear una instancia de FabricaPedidos
        FabricaPedidos fabricaPedidos = new FabricaPedidos();
        // Crear un nuevo pedido
        Pedido pedido = fabricaPedidos.crearPedido(cliente, productos);
        // Mostrar los detalles del pedido
        pedido.mostrarDetalles();
    }
}