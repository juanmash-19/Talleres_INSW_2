public class SistemaEnvios {

    private IProcesarOrdenFedex procesarOrdenFedex;
    private IProcesarOrdenDHL procesarOrdenDHL;
    private IProcesarOrdenUPS procesarOrdenUPS;

    public SistemaEnvios(IProcesarOrdenFedex procesarOrdenFedex,IProcesarOrdenDHL procesarOrdenDHL, IProcesarOrdenUPS procesarOrdenUPS) {
        this.procesarOrdenFedex = procesarOrdenFedex;
        this.procesarOrdenDHL = procesarOrdenDHL;
        this.procesarOrdenUPS = procesarOrdenUPS;
    }

    public void enviarOrdenFedex(Orden orden) {
        procesarOrdenFedex.enviarOrdenFedex(orden);
    }
    
    public void enviarOrdenDHL(Orden orden) {
        procesarOrdenDHL.enviarOrdenDHL(orden);
    }
    
    public void enviarOrdenUPS(Orden orden) {
        procesarOrdenUPS.enviarOrdenUPS(orden);
    }
}
