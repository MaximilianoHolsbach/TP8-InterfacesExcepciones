package Ecommerce;

public class Producto implements Pagable{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        setNombre( nombre);
        setPrecio( precio);
    }

    private void setNombre(String nombre) {
        try {
            if(nombre == null || nombre.trim().isEmpty()){
                throw new IllegalArgumentException("El nombre no puede ser nulo ni vacío.");
            }else{
                this.nombre = nombre;
            }
        } catch (IllegalArgumentException error) {
            System.err.println("Error al asignar nombre: "+error.getMessage());
        }
    }

    private void setPrecio(double precio) {
        double maximo = Double.MAX_VALUE;
        try {
            if(precio > 0.0 && precio < maximo){
                this.precio = precio;
            }else{
                throw new ArithmeticException("El precio no puede ser 0 ni superar base monetaria.");
            }
        } catch (ArithmeticException error) {
            System.err.println("Error al asignar precio: "+error.getMessage());
        }
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    @Override
    public double calcularTotal() {
        return this.precio;
    }
    
}
