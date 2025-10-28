package Ecommerce;
import java.util.Scanner;
public class Cliente implements Notificable, Pago{
    private String nombre;
    private Pago metodoPago;
    private Pedido carrito;
    Scanner input = new Scanner(System.in);
    public Cliente(String nombre, Pago metodoPago) {
        this.nombre = nombre;
        this.metodoPago = metodoPago;
        this.carrito = new Pedido();
    }
    public void cargarProductos(Producto producto){
        this.carrito.agregarProducto(producto);
    } 
    public void verCarrito(){
        this.carrito.getProductos();
    } 
    @Override
    public void notificarCambio() {
        System.out.println("El estado actual del pedido es: "+ this.carrito.getEstado());
    }
    @Override
    public void procesarPago(double monto) {
        String opcion;
        this.metodoPago.procesarPago(monto);
        System.out.print("Para comprar el carrito escriba si para aceptar, no para cancelar: ");
        opcion = input.nextLine();
        
        if(opcion.equalsIgnoreCase("si")){
            this.carrito.actualizarEstado("Pagado");
        }else if(opcion.equalsIgnoreCase("no")){
            this.carrito.actualizarEstado("Cancelado");
        }
    }
    @Override
    public double calcularTotal() {
        double total = this.carrito.calcularTotal();
        return total;
    }
    
}