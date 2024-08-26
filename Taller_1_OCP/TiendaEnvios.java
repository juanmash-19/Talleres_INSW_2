public class TiendaEnvios {

    public static void main(String[] args) {
        Envio envio = new EnvioEstandar(100);
        Tienda tienda = new Tienda();
        tienda.calcularCosto(envio);
        Envio envio2 = new EnvioInternacional(50, 100);
        tienda.calcularCosto(envio2);
      
    }
}
