import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> libros;

    public Libreria() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }

        public Libro buscarPorAutor(String autor) {
            for (Libro libro : libros) {
                if (libro.getAutor().equalsIgnoreCase(autor)) {
                    return libro;
                }
            }

            public Libro buscarPorAnio(String anio) {
                for (Libro libro : libros) {
                    if (libro.getAnio().equalsIgnoreCase(anio)) {
                        return libro;
                    }
                }
        return null;
    }