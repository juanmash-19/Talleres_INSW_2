// Clase para enviar correo electrónico
class CorreoService {
    public void enviarCorreoFactura(Cliente cliente, Factura factura) {
        //  Enviamos el correo electrónico
        System.out.println("Conectando al servidor de correo...");
        System.out.println("Enviando correo a " + cliente.getCorreo() + " con detalles de la factura ID " + factura.getId() + " y valor " + factura.getValor() + ".");
    }
}
