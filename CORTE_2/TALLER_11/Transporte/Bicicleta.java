public class Blicicleta implements Transporte{
    @Override
    public void acelerar() {
        System.out.println("Soy bicicleta y pedaleo");
    }
    @Override
    public void frenar() {
        System.out.println("Soy bicicleta y freno");
    }
    @Override
    public String mostrarInformacion() {
return "Bicicleta";
        }
    