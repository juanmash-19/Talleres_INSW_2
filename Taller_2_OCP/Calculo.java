// Clase abstracta cálculo de impuestos; es decir la clase principal.
// Implementamos el método calcularImpuesto() que será sobrescrito por las clases que lo heredan.

public abstract class Calculo {
    protected double valorProducto;
    protected int cantidad;

    public Calculo(double valorProducto, int cantidad) {
        this.valorProducto = valorProducto;
        this.cantidad = cantidad;
    }
    // Método abstracto que sera heredado por las subclases para calcular el impuesto correspondiente.
    // retorna el valor del impuesto calculado.
    public abstract double calcularImpuesto();
}
