public class Orden {
    private double precio;

    public Orden(double precio) {
        this.precio = precio;
    }

    public double calcularImpuesto() {
        return precio * 0.1; // 10% impuesto
    }

    public double calcularTotalConImpuesto() {
        return precio + calcularImpuesto();
    }

    public double calcularTotalConDescuento(double descuento) {
        double precioConDescuento = precio - descuento;
        return precioConDescuento + calcularImpuesto();
    }
}