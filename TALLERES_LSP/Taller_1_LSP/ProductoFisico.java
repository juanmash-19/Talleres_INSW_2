public class ProductoFisico extends Producto implements Enviar {
    private double peso;

    public ProductoFisico(double peso, String nombre, int cantidad, double precio) {
        super(nombre, cantidad, precio);
        this.peso = peso;
    }
    @Override
    public double calcularCosto(){
        return this.getCantidad() * this.getPrecio() * this.peso;
    }
    @Override
    public void enviarPorCorreo() {
        System.out.println("Estoy enviando este producto físico por correo");
    }
}
