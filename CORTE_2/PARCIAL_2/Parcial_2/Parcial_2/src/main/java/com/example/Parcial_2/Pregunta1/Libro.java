public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private int anio;

    public Libro(String titulo, String autor, double precio, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAnio() {
        return anio;
    }
}