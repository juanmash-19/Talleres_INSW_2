public class Libro implements LibreriaLibro{
    private String nombre;
    private int numHojas;
    private String imagen;
    private String serial;

    public Libro(String nombre, int numHojas, String imagen, String serial) {
        this.nombre = nombre;
        this.numHojas = numHojas;
        this.imagen = imagen;
        this.serial = serial;
    }

    @Override
    public void prestar() {
    }

    @Override
    public void devolver() {
    }
}