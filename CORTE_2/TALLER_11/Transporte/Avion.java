public class Avion implements Transporte{
    @Override
    public void acelerar() {
        System.out.println("soy un avion ya acelero");
    }
    @Override
    public void frenar() {
        System.out.println("soy un avion y freno");
    }
    @Override
    public String mostrarInformacion() {
return "AVION";
        }
    
}