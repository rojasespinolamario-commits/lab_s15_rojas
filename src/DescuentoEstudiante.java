public class DescuentoEstudiante implements DescuentoStrategy {

    @Override
    public double aplicarDescuento(double precio) {
        return precio * 0.90;
    }

    @Override
    public String obtenerDescripcion() {
        return "Descuento estudiante (10%)";
    }
}
