public class EnvioEstandar implements Envio {
    
    private double peso;
    
    public EnvioEstandar(double peso) {
    this.peso = peso;
    }

    public double calcularCosto() {
        return peso * 200 ;
    }
}
