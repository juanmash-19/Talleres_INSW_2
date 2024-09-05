public class ProductoMixto extends Producto implements Enviar{
    private double peso;
    private double tamañoArchivo;

    public ProductoMixto(String nombre, int cantidad, double precio, double peso, double tamañoArchivo) {
        super(nombre, cantidad, precio);
        this.peso = peso;
        this.tamañoArchivo = tamañoArchivo;
    }
    
    @Override
    public double calcularCosto() {
        return peso*tamañoArchivo;
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("Enviando por correo este producto mixto");
    }
}
