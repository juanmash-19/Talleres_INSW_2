// Clase que calcula el impuesto para productos saludables.
public class CalculoImpuestoSaludable extends Calculo {
    private static final double IMPUESTO_SALUDABLE = 0.05;

    public CalculoImpuestoSaludable(double valorProducto, int cantidad) {
        super(valorProducto, cantidad);
    }

    /**
     * Calcula el impuesto saludable basado en el valor del producto y la cantidad.
     * @return el impuesto saludable calculado.
     */
    @Override
    public double calcularImpuesto() {
        return valorProducto * cantidad * IMPUESTO_SALUDABLE;
    }
}
