public class EnvioInternacional implements Envio {
    private double peso;
    private double distancia;
    
    public EnvioInternacional(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public double calcularCosto() { 
        return peso * distancia * 500; 

    }
}
