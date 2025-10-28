package Ecommerce;
public class Paypal implements PagoConDescuento{
    private String email;
    public Paypal(String email) {
        this.email = email;
    }
    @Override
    public double aplicarDescuento(double monto) {
        return  monto -= monto * 0.05;
    }
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con pay pal por $" + aplicarDescuento(monto));
    }
    @Override
    public double calcularTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}