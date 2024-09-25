// Ejecutamos todas las clases y calculamos los impuestos.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Probamos las clases
        Calculo iva = new CalculoImpuestoIVA(200, 3);
        Calculo reteIva = new CalculoImpuestoRete(200, 3);
        Calculo saludable = new CalculoImpuestoSaludable(200, 3);

        Factura factura = new Factura(Arrays.asList(iva, reteIva, saludable));

        // Cálculamos total de impuestos
        double totalImpuestos = factura.calcularTotalImpuestos();

        // Mostramos el resultado
        System.out.println("Total de impuestos: " + totalImpuestos);
    }
}
