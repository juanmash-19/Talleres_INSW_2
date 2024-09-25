public class EnvioExpress implements Envio {

    private double distancia;

    public double calcularCosto() {
        return distancia * 100;
        
    }
}