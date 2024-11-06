public class ImpDAO implements DAO{
    @Override
    public void guardarProducto(Producto producto) {
        System.out.println("Producto guardado");
    }
    @Override
    public void guardarCliente(Cliente cliente) {
      System.out.println("Cliente guardado");
    }
    @Override
    public void guardarFactura(Factura factura) {
      System.out.println("Factura guardado");
    }
    
}