package Pregunta1;
public class OrdenEstado {
    public String obtenerEstado(int ordenId) {
        switch (ordenId) {
            case 0:
                return "Orden Inválida";
            case 1:
                return "En Progreso";
            case 100:
                return "Completada";
            default:
                return "Pendiente";
        }
    }
}