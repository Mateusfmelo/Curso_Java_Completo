package Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ex_005 {
    
    public static void main (String[] args){

        /*Fazer um programa para ler o código de uma peça 1, 
        o número de peças 1, o valor unitário de cada peça 1,
        o código de uma peça 2, o número de peças 2 e o valor 
        unitário de cada peça 2. Calcule e mostre o valor a 
        ser pago*/
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qtde1, qtde2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        qtde1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtde2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * qtde1 + preco2 * qtde2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();

    }
}
