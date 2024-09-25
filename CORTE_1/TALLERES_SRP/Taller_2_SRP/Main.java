public class Main {
    public static void main(String[] args) {
        // Creamos las instancias
        Factura factura = new Factura(1, 200.000);
        Cliente cliente = new Cliente ("Juan Suarez", "juan.suarez@gmail.com");
        
        // Guardamos la factura y cliente en la base de datos
        FacturaDAO facturaDAO = new FacturaDAO();
        ClienteDAO clienteDAO = new ClienteDAO();
        facturaDAO.guardarFactura(factura);
        clienteDAO.guardarCliente(cliente);

        // Enviamos correo electronico con la factura al cliente
        CorreoService correoService = new CorreoService();
        correoService.enviarCorreoFactura(cliente, factura);

        // Generamos un reporte de las facturas
        ReporteFacturas reporteFacturas = new ReporteFacturas();
        reporteFacturas.generarReporte();

        // Enviamos la factura a la DIAN
        DianService dianService = new DianService();
        dianService.enviarFacturaDian(factura);
    }
}