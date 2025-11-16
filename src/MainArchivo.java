//Importamos los paquetes de los archivos, Scanner y FileNotFoundException
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Creamos la clase MainArchivo en el cual apararece el metodo main en el cual utilizaremsos try para que busque el archivo si existe y si no utilizaresmos catch para que salga un error.
public class MainArchivo {
    public static void main(String[] args) {
        try {
            File archivo= new File("archivo_que_no_existe.txt");
            Scanner leer = new Scanner(archivo);
//Creamos el bucle while, para que cuando el usuario introduzca el nombre del archivo encuentrado y diga si es verdadero o falso
            while (leer.hasNextLine()) {
                System.out.println(leer.nextLine());
            }
            leer.close();
        }catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }
    }
}
