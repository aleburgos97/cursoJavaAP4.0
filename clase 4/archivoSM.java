package Clase4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class archivoSM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //en este ej vamos a ingresar nosotros en el programa la direccion del block de notas
        System.out.println("Ingrese la ruta del archivo:");
        String rutaArchivo = scanner.nextLine();

        System.out.println("Ingrese la operación (suma o multiplicación):");
        String operacion = scanner.nextLine();

        int resultado = 0;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea = lector.readLine();
            while (linea != null) {
                int numero = Integer.parseInt(linea.trim());
                if (operacion.equals("suma")) {
                    resultado += numero;
                } else if (operacion.equals("multiplicación")) {
                    if (resultado == 0) {
                        resultado = numero;
                    } else {
                        resultado *= numero;
                    }
                } else {
                    System.out.println("La operación " + operacion + " no es válida.");
                    return;
                }
                linea = lector.readLine();
            }
            lector.close();
            scanner.close();
            System.out.println("El resultado de la " + operacion + " de los números en el archivo es: " + resultado);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}