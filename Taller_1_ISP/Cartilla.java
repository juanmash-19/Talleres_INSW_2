public class Cartilla implements LibreriaCartilla{
    private String nombre;
    private String numeroHojas;

    public Cartilla(String nombre, String numeroHojas) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
    }

    @Override
    public void prestar() {
    }

    @Override
    public void devolver() {
    }
}
