package exerciciciosIF;

import java.util.Scanner;

public class exercicio2 {
//    Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //O operador % é chamado de módulo ou resto da divisão.
        if (N % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        sc.close();
    }

}
