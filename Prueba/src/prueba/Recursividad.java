package prueba;
public class Recursividad {
    public static void main(String[] args) {
        System.out.println("Resultado: " + suma(6));
    }
    public static int suma(int n) {
        if(n == 1){
            System.out.println(n);
            return 1;
        }else{
            System.out.println(n);
            return (n+suma(n-1));
        }
    }
}