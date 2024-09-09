public class Main {
    public static void main(String[] args) {
        IProcesarOrdenFedex procesarOrdenFedex = new IProcesarOrdenFedexImpl();
        IProcesarOrdenUPS procesarOrdenUPS = new IProcesarOrdenUPSImpl();
        IProcesarOrdenDHL procesarOrdenDHL = new IProcesarOrdenDHLmpl();
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenFedex, procesarOrdenUPS, procesarOrdenDHL);
        Orden orden = new Orden(null, "Manizales", "Bogota");
        sistemaEnvios.enviarOrdenFedex(orden);
        sistemaEnvios.enviarOrdenUPS(orden);
        sistemaEnvios.enviarOrdenDHL(orden);
    }
}
