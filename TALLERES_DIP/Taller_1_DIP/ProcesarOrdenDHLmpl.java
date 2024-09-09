public class ProcesarOrdenDHLmpl implements IProcesarOrdenDHL{

    @Override
    public void enviarOrdenDHL(Orden orden) {
        System.out.println(orden.getLugarOrigen());
        System.out.println("Hacia:");
        System.out.println(orden.getLugarDestino());
        System.out.println("Con la operadora DHL")
    }
}

