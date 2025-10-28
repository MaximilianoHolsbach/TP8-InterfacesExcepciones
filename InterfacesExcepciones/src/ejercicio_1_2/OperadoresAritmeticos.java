package ejercicio_1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperadoresAritmeticos {
    public void division(){
        int y, x, c;
        try {
            System.out.print("Ingrese el numero para el primer valor: ");
            x = new Scanner(System.in).nextInt();
            System.out.print("Ingrese el numero para el Segundo valor: ");
            y = new Scanner(System.in).nextInt();
            c = x/y;
            System.out.println("El resultado es: "+c);
        } catch (InputMismatchException error) {
            System.out.println("No es un numero");
        } 
        catch (ArithmeticException  error){
            System.out.println("No se puede dibidir por cero");
        }catch(Exception error){
            System.err.println("Error: "+error.getMessage());
        }finally {
            System.out.println("Fin del ejercicio");
        }
        
    }
    public void entradaNumerica(){
        try {
            System.out.print("Ingresa un número entero: ");
            String entrada = new Scanner(System.in).nextLine();
            int aNumero = Integer.parseInt(entrada);
            System.out.println("El numero casteado es: "+aNumero);
        } catch (NumberFormatException error) {
            System.out.println("No es un numero");
        } finally {
            System.out.println("Fin del ejercicio");
        }
    }
}
