package teste;

import java.util.Scanner;

public class teste006 {
    
    public static void main (String[] args) {

        // Estrutura for

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        sc.close();
    }
}
