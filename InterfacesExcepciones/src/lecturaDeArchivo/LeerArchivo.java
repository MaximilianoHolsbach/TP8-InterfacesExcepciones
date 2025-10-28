package lecturaDeArchivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public void lectura(String ruta){
        Scanner lector = null;
        try {
            File archivo = new File(ruta);
            lector = new Scanner(archivo);
            System.out.println("Contenido del archivo:");
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException error) {
            System.out.println("Error: El archivo no fue encontrado.");
        } finally {
            if (lector != null) {
                lector.close();
                System.out.println("Scanner cerrado correctamente.");
            }
        }
    }
}
