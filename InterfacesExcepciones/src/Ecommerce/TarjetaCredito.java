package Ecommerce;
public class TarjetaCredito implements PagoConDescuento{
    private String entidad;
    public TarjetaCredito(String entidad) {
        this.entidad = entidad;
    }  
    @Override
    public double aplicarDescuento(double monto) {
        return  monto -= monto * 0.1;
    }
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta por $" + aplicarDescuento(monto));
    }
    @Override
    public double calcularTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}