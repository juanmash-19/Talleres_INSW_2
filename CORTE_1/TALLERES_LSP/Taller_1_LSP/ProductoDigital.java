public class ProductoDigital extends Producto{
    private double tamañoArchivo;

    public ProductoDigital(double tamañoArchivo, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public double calcularCosto() {
        return this.getPrecio()*this.getCantidad() +0.5* tamañoArchivo;    
    }

    public double getTamañoArchivo() {
        return tamañoArchivo;
    }

    public void setTamañoArchivo(double tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }
    
}