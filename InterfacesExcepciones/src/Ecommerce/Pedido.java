package Ecommerce;
import java.util.ArrayList;
public class Pedido implements Pagable{
    private ArrayList<Producto> productos;
    private String estado;
    private double total;
    public Pedido() {
        this.estado = "Pendiente";
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto){
        try {
            if(producto == null){
                throw new IllegalArgumentException("Error al cargar el producto al carrito");
            }else{
                this.productos.add(producto);
            }
        } catch (IllegalArgumentException error) {
            System.err.println("Error: "+error.getMessage());
        }
    }
    public String getEstado() {
        return estado;
    }
    public double getTotal() {
        return total;
    }
    public void getProductos() {
        for (Producto producto : productos) {
            System.out.println("Nombre: "+producto.getNombre()+"\nPrecio: "+producto.getPrecio());
            System.out.println("--------------------------");
        }
    } 
    @Override
    public double calcularTotal() {
        for (Producto producto : productos) {
            this.total += producto.getPrecio();
        }
        return this.total;
    }
    public void actualizarEstado(String estado){
        try {
            if(estado == null || estado.trim().isEmpty()){
                throw new IllegalArgumentException("No puede ingresar un estado vacio");
            }else{
                this.estado = estado;
            }
        } catch (IllegalArgumentException error) {
            System.err.println("Error: "+ error.getMessage());
        }
    }
    
}