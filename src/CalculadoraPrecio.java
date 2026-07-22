public class CalculadoraPrecio {

    private DescuentoStrategy estrategia;

    public CalculadoraPrecio(DescuentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularPrecioFinal(double precio) {
        return estrategia.aplicarDescuento(precio);
    }

    public void mostrarDetalle(double precio) {
        double total = calcularPrecioFinal(precio);

        double descuento = precio - total;

        System.out.println("=========================");
        System.out.println("      TIENDA DE CAFE     ");
        System.out.println("=========================");

        System.out.println("Precio original: S/" + String.format("%.2f", precio));

        System.out.println("Descuento aplicado: " + estrategia.obtenerDescripcion());

        System.out.println("Monto descontado: S/" + String.format("%.2f", descuento));

        System.out.println("Total a pagar: S/" + String.format("%.2f", total));

        System.out.println("==========================");
    }

    public void cambiarEstrategia(DescuentoStrategy estrategia) {
        this.estrategia = estrategia;
    }
}
