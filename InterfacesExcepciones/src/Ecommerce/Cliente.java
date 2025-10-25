/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecommerce;

/**
 *
 * @author Maxi
 */
public class Cliente implements Notificable{
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public void recibirNotificacion(Estado estado){
        System.out.println("El estado del pedido es: "+estado);
    }

    @Override
    public Estado notificarCambio() {
        return null;
    }
    
}
