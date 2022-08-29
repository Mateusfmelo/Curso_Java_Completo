package Exercícios;

import java.util.Scanner;

public class ex_001 {
    
    /*Faça um programa para ler dois valores inteiros, 
    e depois mostrar na tela a soma desses números com uma
    mensagem explicativa, conforme exemplos.*/

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("SOMA = " + (x + y));

        sc.close();

    }
}
