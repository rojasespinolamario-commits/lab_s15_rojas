public class SinDescuento implements DescuentoStrategy {

    @Override
    public double aplicarDescuento(double precio) {
        return precio;
    }

    @Override
    public String obtenerDescripcion() {
        return "Sin descuento aplicado (0%)";
    }
}
