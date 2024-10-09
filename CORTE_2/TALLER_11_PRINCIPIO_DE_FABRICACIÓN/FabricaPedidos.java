public class FabricaPedidos {
    private int contadorPedidos = 1;
    
    public Pedido crearPedido(Cliente cliente, List<Producto> productos) {
        Pedido nuevoPedido = new Pedido(contadorPedidos,cliente,productos);
        return nuevoPedido;
    }
}