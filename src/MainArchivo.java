import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainArchivo {
    public static void main(String[] args) {
        try {
            File archivo= new File("archivo_que_no_existe.txt");
            Scanner leer = new Scanner(archivo);

            while (leer.hasNextLine()) {
                System.out.println(leer.nextLine());
            }
            leer.close();
        }catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }
    }
}