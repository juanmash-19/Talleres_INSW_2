// Clase para enviar la factura a la DIAN
class DianService {
    public void enviarFacturaDian(Factura factura) {
        // Enviar la factura a la DIAN
        System.out.println("Conectando a la API de la DIAN...");
        System.out.println("Enviando factura ID " + factura.getId() + " con valor " + factura.getValor() + " a la DIAN.");
        System.out.println("Factura enviada exitosamente a la DIAN.");
    }
}
