package Aula_003;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        /*double x;
        x = sc.nextDouble();
        */
        char x;
        x = sc.next().charAt(0);
        System.out.println("Você digitou: " + x);
        
        
        //System.out.printf("Você digitou: %.1f%n" , x);
        //System.out.println("Você digitou: " + x);
        
        sc.close();
    }
}
