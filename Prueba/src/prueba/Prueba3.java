package prueba;

import java.io.*;

public class Prueba3 {
    public static void main(String[] args) {
        try{
            File Prueba = new File("Prueba3.txt");
            if(Prueba.createNewFile()){
                System.out.println("Se ha creado el archivo");
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch(IOException e){
            System.out.println("Hubo con el archivo: " + e.getMessage());
            
        }
        try{
            FileOutputStream bo = new FileOutputStream("Prueba3.txt");
            String data = "Mango con mango";
            byte b[] = data.getBytes();
            bo.write(b);
            bo.close();
        }catch(IOException e){
            System.out.println("Hubo un error con el archivo: " + e.getMessage());
        }
            
        try{
            FileInputStream bi = new FileInputStream("Prueba3.txt");
            int i;
            while ((i=bi.read())!=-1){
                System.out.print((char)i);
            }
            System.out.println("\n");
        }catch(IOException e){
            System.out.println("Hubo un error con el archivo");
        }
    }
}
