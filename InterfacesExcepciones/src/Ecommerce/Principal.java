package Ecommerce;

public class Principal {
    public static void main(String[]args){
        Producto producto1 = new Producto("Kimchi (500g)", 4.99);
        Producto producto2 = new Producto("Ramyeon picante", 1.49);
        Producto producto3 = new Producto("Tteokbokki instantáneo", 3.75);
        Producto producto4 = new Producto("Salsa Gochujang (200g)", 2.95);
        Producto producto5 = new Producto("Algas tostadas (pack x10)", 3.20);
        Producto producto6 = new Producto("Bebida de arroz Sikhye", 2.10);
        Producto producto7 = new Producto("Pan de melón coreano", 1.85);
        Producto producto8 = new Producto("Choco Pie (pack x6)", 2.99);
        Producto producto9 = new Producto("Té de cebada (Barley Tea)", 3.40);
        Producto producto10 = new Producto("Arroz glutinoso (1kg)", 5.25);
        
        Pago metodoPago1 = new TarjetaCredito("Visa");
        Cliente cliente1 = new Cliente("Marcelo", metodoPago1);
        
        cliente1.cargarProductos(producto1);
        cliente1.cargarProductos(producto2);
        cliente1.cargarProductos(producto3);
        cliente1.verCarrito();
        cliente1.notificarCambio();
        cliente1.procesarPago(cliente1.calcularTotal());
        cliente1.notificarCambio();
        
        Pago metodoPago2 = new Paypal("leandro@paypal.com");
        Cliente cliente2 = new Cliente("Leandro", metodoPago2);
        
        cliente2.cargarProductos(producto4);
        cliente2.cargarProductos(producto5);
        cliente2.cargarProductos(producto6);
        cliente2.verCarrito();
        cliente2.notificarCambio();
        cliente2.procesarPago(cliente2.calcularTotal());
        cliente2.notificarCambio();
    }
}
