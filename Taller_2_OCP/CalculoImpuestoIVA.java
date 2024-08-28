// Clase que calcula el impuesto sobre el valor añadido (IVA).
public class CalculoImpuestoIVA extends Calculo {
    private static final double IVA = 0.19;

    public CalculoImpuestoIVA(double valorProducto, int cantidad) {
        super(valorProducto, cantidad);
    }
    // Calculamos el impuesto IVA basado en el valor del producto y la cantidad.
    // retronamos el IVA calculado.
    @Override
    public double calcularImpuesto() {
        return valorProducto * cantidad * IVA;
    }
}
