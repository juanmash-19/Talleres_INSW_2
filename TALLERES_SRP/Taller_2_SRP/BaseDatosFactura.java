// Clase para guardar Facturas en la base de datos 
class FacturaDAO {
    public void guardarFactura(Factura factura) {
        // Como se guardaria la factura en la base de datos
        System.out.println("Conectando a la base de datos...");
        System.out.println("Guardando factura con ID " + factura.getId() + " y valor " + factura.getValor() + " en la base de datos.");
    }
}