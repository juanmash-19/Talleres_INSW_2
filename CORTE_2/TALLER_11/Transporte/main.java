public class main {
    @param args 
    public static void main(String[] args) {
        
        Garaje garaje = new Garaje();
        Carro coche = new Carro();
        Avion avion = new Avion();
        Blicicleta bicicleta = new Blicicleta();
        garaje.estacionar(coche);
        garaje.estacionar(avion);
        garaje.estacionar(bicicleta);
    }
    
}