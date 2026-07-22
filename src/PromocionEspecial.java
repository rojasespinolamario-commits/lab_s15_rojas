public class PromocionEspecial implements DescuentoStrategy {

    @Override
    public double aplicarDescuento(double precio) {
        return precio * 0.80;
    }

    @Override
    public String obtenerDescripcion() {
        return "Promocion especial del dia (20%)";
    }
}
