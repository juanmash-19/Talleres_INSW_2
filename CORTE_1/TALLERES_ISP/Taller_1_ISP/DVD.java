public class DVD implements LibreriaDVD{
    private String nombre;
    private double tamaño;
    private String Archivo;
    private int stock;

    public DVD(String nombre, double tamaño, String archivo, int stock) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.Archivo = archivo;
        this.stock = stock;
    }

    @Override
    public void prestar() {
    }

    @Override
    public void devolver() {
    }

}