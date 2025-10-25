package Ecommerce;

import java.util.ArrayList;

public class Pedido implements Pagable, Notificable {
    private ArrayList<Producto> productos;
    private Estado estado;
    private Cliente cliente;

    public Pedido(Estado estado, Cliente cliente) {
        this.estado = estado;
        this.productos = new ArrayList<>();
        this.cliente = cliente;
    }
    public void agregarProductos(Producto producto){
        productos.add(producto);
    }
    public void cambiarEstado(Estado estado){
        this.estado = estado;
        notificarCambio();
    }

    public Estado getEstado() {
        return estado;
    }
    
    
    @Override
    public double calcularTotal() {
        double total = 0.0;
        return total;
    }

    @Override
    public Estado notificarCambio() {
        cliente.recibirNotificacion(getEstado());
        return getEstado();
    }
    
    
}
