package Exercícios;

import java.util.Scanner;

public class ex_011 {
    

    public static void main (String[] args) {

        /*Com base na tabela abaixo, escreva um programa
        que leia o código de um item e a quantidade deste 
        item. A seguir, calcule e mostre o valor da conta 
        a pagar.*/

        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        double total;

        if (cod == 1) {
            total = qtd * 4.0;
        }

        else if (cod == 2) {
            total = qtd * 4.5;
        }

        else if (cod == 3) {
            total = qtd * 5.0;
        }

        else if (cod == 4) {
            total = qtd * 2.0;
        }

        else {
            total = qtd * 1.5;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}
