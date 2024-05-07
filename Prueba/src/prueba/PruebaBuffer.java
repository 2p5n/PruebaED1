package prueba;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.*;
public class PruebaBuffer {

    public static void main(String[] args) {
        try {
            File Prueba2 = new File("Prueba2.txt");
            if (Prueba2.createNewFile()) {
                System.out.println("El archivo se ha creado");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Hubo un erro: " + e.getMessage());
        }
        try{
            BufferedWriter b = new BufferedWriter(new FileWriter("Prueba2.txt"));
            String cadena[] = {"Juan ", "Pedro ", "Jesus"};
            for (int i = 0; i < cadena.length; i++) {
                b.write(cadena[i]);
            }
            b.close();
        }catch(IOException e){
            System.out.println("Hubo un erro: " + e.getMessage());
        }
        try{
            BufferedReader r = new BufferedReader(new FileReader("Prueba2.txt"));
            String cadena = r.readLine();
                System.out.println(cadena);
            r.close();
        }catch(IOException e){
            System.out.println("Hubo un erro: " + e.getMessage());

        }
    }
}
