

import java.util.Scanner;
/**
 * Write a description of class calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calculadora
{
    public static void main (String[]args){
        Scanner t1 = new Scanner(System.in);
        System.out.println("Hola buenas tardes");
        while(0<1){
            System.out.println("Introduzca la op a realizar: 1 potencia, 2 factorial, 0 cierra el programa");
            int d = t1.nextInt();
            switch(d){
                case 1:
                System.out.println("Introduzca el numero a elevar, y luego la potencia deseada");
                int d1 = t1.nextInt();
                int d2 = t1.nextInt();
                System.out.println("Resultado");
                System.out.println(potencia(d1,d2));
                break;
                
                case 2:
                System.out.println("Introduzca numero del que desea hacer el factorial");
                int d3= t1.nextInt();
                System.out.println("Resultado");
                System.out.println(factorial(d3));
                break;
                
                case 0: 
                System.out.println("Gracias por confiar en nuestro programa");
                System.exit(0);
                
                default:
                System.out.println("Eso no son valores validos.");
                break;

            }
        }
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
