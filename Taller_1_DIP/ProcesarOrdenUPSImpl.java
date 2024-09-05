public class ProcesarOrdenUPSImpl implements IProcesarOrdenUPS{

    @Override
    public void enviarOrdenUPS(Orden orden) {
        System.out.println(orden.getLugarOrigen());
        System.out.println("Hacia:");
        System.out.println(orden.getLugarDestino());
        System.out.println("Con la operadora UPS")
    }
}
