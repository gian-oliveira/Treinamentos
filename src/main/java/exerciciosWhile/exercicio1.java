package exerciciosWhile;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
/*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
        Exemplo:
        Entrada: Saída:
        2200
        1020
        2022
        2002
        Senha Invalida
        Senha Invalida
        Senha Invalida
        Acesso Permitido
 */

        Scanner sc = new Scanner(System.in);

        int senha =0;

        while(senha!= 2002){
            System.out.println("Digite a senha válida: ");
            senha = sc.nextInt();

            if (senha!= 2002) {
                System.out.println("Senha inválida, tente novamente.");
            }
        }

        System.out.printf("Acesso Permitido");

        sc.close();
    }

}
