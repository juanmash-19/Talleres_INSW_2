public class main {
    @param args 
    public static void main(String[] args) {
        // Crear una instancia de FacturaService
        FacturaService facturaService = new FacturaService(baseDeDatos);
        // Procesar la factura
        facturaService.procesarFactura(cliente, productos);
        // Mostrar información de la factura
        Factura factura = new Factura(cliente, productos);
        double totalSinDescuento = factura.calcularTotal();
        double totalConDescuento = factura.calcularPrecioConDescuento(4000);
        String numeroFactura = factura.generarNumeroFactura();
        System.out.println( numeroFactura);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("Total con descuento: $" + totalConDescuento);
    }
};