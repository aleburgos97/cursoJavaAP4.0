package Clase4;


import java.io.BufferedReader;
import java.io.FileReader;

public class archivos {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\Ale\\eclipse-workspace\\numeros.txt"; // Aquí se asigna la ruta del archivo
        int suma = 0;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea = lector.readLine();
            while (linea != null) {
                suma += Integer.parseInt(linea.trim());
                linea = lector.readLine();
            }
            lector.close();
            System.out.println("La suma de los números en el archivo es: " + suma);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
