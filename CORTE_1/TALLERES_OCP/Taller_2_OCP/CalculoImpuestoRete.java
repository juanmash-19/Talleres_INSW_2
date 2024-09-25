// Clase para calcular la retención del IVA.

public class CalculoImpuestoRete extends Calculo {
    private static final double RETE_IVA = 0.10;

    public CalculoImpuestoRete(double valorProducto, int cantidad) {
        super(valorProducto, cantidad);
    }

    // Calculamos la retención del IVA basado en el valor del producto y la cantidad.
    //retornamos el impuesto retenido del IVA calculado.

    @Override
    public double calcularImpuesto() {
        return valorProducto * cantidad * RETE_IVA;
    }
}
