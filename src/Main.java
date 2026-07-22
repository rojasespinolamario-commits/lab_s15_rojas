public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido("Cafe Latte", 10.00);

        CalculadoraPrecio calculadora = new CalculadoraPrecio(new DescuentoEstudiante());

        System.out.println("Producto: " + pedido.getProducto());

        calculadora.mostrarDetalle(pedido.getPrecio());

        System.out.println();

        calculadora.cambiarEstrategia(new DescuentoClienteFrecuente());

        System.out.println("Nuevo cliente: Cliente Frecuente");

        calculadora.mostrarDetalle(pedido.getPrecio());
    }
}