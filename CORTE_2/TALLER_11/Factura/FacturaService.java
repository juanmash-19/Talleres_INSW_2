public class FacturaService {
        private BaseDeDatos baseDeDatos;
    public FacturaService(BaseDeDatos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }
    public void procesarFactura(Cliente cliente, List<Producto> productos) {
  //Logica para procesar unaa facruira
        baseDeDatos.guardarCliente(cliente);
        System.out.println("Facrturaa procesada");
    }
}