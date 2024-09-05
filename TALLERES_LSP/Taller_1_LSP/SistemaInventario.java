public class SistemaInventario {

    public static void main(String[] args) {
        Producto productoFisico1 = new ProductoFisico(10, "nombre", 30, 40);
        Inventario inventario = new Inventario();
        inventario.calcular(productoFisico1);
        Producto productoFisico2 = new ProductoFisico (20, "", 0, 0);
    }
    
}
