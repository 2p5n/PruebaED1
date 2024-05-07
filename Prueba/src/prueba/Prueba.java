package prueba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Prueba {

    public static void main(String[] args) {
        try {
            File archivo = new File("Prueba.txt");
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
        try{
            FileWriter w = new FileWriter("Prueba.txt");
            w.write("Mango con mango");
            w.close();
        }catch(IOException e){
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
        try{
            FileReader r = new FileReader("Prueba.txt");
            int i;
            while ((i=r.read())!=-1)
                System.out.print((char)i);
                System.out.println("\n");
            r.close();
        }catch(IOException e){
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}
