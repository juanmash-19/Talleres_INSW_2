public class Carro implements Transporte{
    @Override
    public void acelerar() {
        System.out.println("soy carro y acelero");
    }
    @Override
    public void frenar() {
        System.out.println("Soy carro y freno");   
    }
    @Override
    public String mostrarInformacion() {
        return "Carro";
    }
    
}