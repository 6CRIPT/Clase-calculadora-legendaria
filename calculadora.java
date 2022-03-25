
import java.util.Scanner;
/**
 * Write a description of class calculadora here.
 * 
 * @author DON 6CRIPT
 * @version (a version number or a date)
 */
public class calculadora
{
    public static void main (String[]args){
        Scanner t1 = new Scanner(System.in);
        System.out.println("Hola buenas tardes");
        while(0<1){
            System.out.println("Introduzca la op a realizar: 1 potencia, 2 factorial, 3 suma, 4 resta, 4 multiplicacion 0 cierra el programa");
            int d = t1.nextInt();
            switch(d){
                case 1:
                System.out.println("Introduzca el numero a elevar, y luego la potencia deseada");
                int d1 = t1.nextInt();
                int d2 = t1.nextInt();
                System.out.println("Resultado");
                System.out.println(potencia(d1,d2));
                System.out.println("*****************************************************************************************************************");
                break;
                
                case 2:
                System.out.println("Introduzca numero del que desea hacer el factorial");
                int d3= t1.nextInt();
                System.out.println("Resultado");
                System.out.println(factorial(d3));
                System.out.println("*****************************************************************************************************************");
                break;
                
                case 3:
                System.out.println("Introduzca los 2 numeros a sumar");
                int d4 = t1.nextInt();
                int d5 = t1.nextInt();
                System.out.println("Resultado");
                System.out.println(suma(d4, d5));
                System.out.println("*****************************************************************************************************************");
                break;
                
                case 4:
                System.out.println("Introduzca los 2 numeros a restar");
                int d6 = t1.nextInt();
                int d7 = t1.nextInt();
                System.out.println("Resultado");
                System.out.println(resta(d6, d7));
                System.out.println("*****************************************************************************************************************");
                break;
                
                case 5: 
                System.out.println("Introduzca los 2 numeros a multiplicar");
                int d8 = t1.nextInt();
                int d9 = t1.nextInt();
                System.out.println("Resultado");
                System.out.println(mult(d8, d9));
                System.out.println("*****************************************************************************************************************");
                break;
                
                case 0: 
                System.out.println("Gracias por confiar en nuestro programa");
                System.out.println("*****************************************************************************************************************");
                System.exit(0);
                
                default:
                System.out.println("Eso no son valores validos.");
                break;

            }
        }
    }
    
    public static int suma (int n, int t){
        return n + t;
    }
    
    public static int resta (int n, int t){
        return n - t;
    }
    
    public static int mult(int n, int t){
        return n*t;
    }
    
    public static int factorial(int n){
        if(n==0){return 1;}
        int i = n * factorial(n-1);
        return i;
    }

    public static int potencia (int n, int p){
        if (p==0){return 1;}
        int i = n * potencia (n,p-1);
        return i;   
    }
}
