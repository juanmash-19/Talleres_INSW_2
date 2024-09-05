// Clase factura donde cálculamos impuestos.
import java.util.List;

public class Factura {
    private List<Calculo> calculos;

    public Factura(List<Calculo> calculos) {
        this.calculos = calculos;
    }
    // Calculamos el total de impuestos sumando todos.
    // la suma total de impuestos calculados.
    public double calcularTotalImpuestos() {
        return calculos.stream()
                    .mapToDouble(Calculo::calcularImpuesto)
                    .sum();
    }
}
