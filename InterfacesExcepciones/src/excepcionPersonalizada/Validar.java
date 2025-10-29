/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionPersonalizada;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Validar {
    public void edad() throws EdadInvalidaException{
        int edad;
        try {
            int maxValue = 149;
            System.out.print("Ingrese el numero para el primer valor: ");
            edad = new Scanner(System.in).nextInt(); 
            if(!(edad < 0 || edad > maxValue)){
                if(edad < 18){
                    System.out.println("La edad ingresada: "+edad+" indica que eres menor");
                }else{
                    System.out.println("La edad ingresada: "+edad+" indica que eres mayor");
                }
            }
            throw new EdadInvalidaException("La edad ingresada no puede ser menor a 0 o mayor a 150");
        } catch (EdadInvalidaException error) {
            System.err.println("Error: "+error.getMessage());
        } finally {
        }
    }
}
