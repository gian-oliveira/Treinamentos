package exerciciciosIF;

import java.util.Scanner;

public class exercicio1 {

    //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um número");
        num = scanner.nextInt();

        if(num >= 0){
            System.out.println("O número digitado é maior ou igual a 0 e é positivo");
        } else{
            System.out.println("O número digitado é negativo");
        }
scanner.close();
    }

}