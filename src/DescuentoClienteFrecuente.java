public class DescuentoClienteFrecuente implements DescuentoStrategy {

    @Override
    public double aplicarDescuento(double precio) {
        return precio * 0.85;
    }

    @Override
    public String obtenerDescripcion() {
        return "Descuento cliente frecuente (15%)";
    }
}
