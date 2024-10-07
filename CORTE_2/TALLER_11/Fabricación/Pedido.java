public class Pedido {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(int id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.fecha = new Date(); // Asignar fecha actual
        this.cliente = cliente;
        this.productos = productos;
    }

    public double calcularTotal() {
        return productos.stream().mapToDouble(p -> p.getPrecio() * p.getCantidad()).sum();
    }
    
    public void mostrarDetalles() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre() + ", Dirección: " + cliente.getDireccion());
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + " x" + producto.getCantidad() + ": $" + producto.getPrecio());
        }
        System.out.println("Total: $" + calcularTotal());
    }
}