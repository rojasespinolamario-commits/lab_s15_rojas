public class Pedido {

    private String producto;

    private double precio;

    public Pedido(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }
}
