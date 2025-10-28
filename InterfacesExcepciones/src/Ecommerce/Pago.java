package Ecommerce;
public interface Pago extends Pagable {
    public abstract void procesarPago(double monto);
}
