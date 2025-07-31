package org.example;

import java.util.Scanner;

public class Calculadora {

    public static void calculadora(String[] args) {
        //soma
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        var value1 = scanner.nextInt();

        System.out.println("Informe o segundo número");
        var value2 = scanner.nextInt();

        System.out.printf("A soma de %s + %s = %s\n", value1, value2, value1+value2);

        System.out.printf("\n\n\n");

        //Subtração
        System.out.println("Informe o primeiro número para divisão");
        var valueSubtracao1 = scanner.nextFloat();

        System.out.println("Informe o segundo número para divisão");
        var valueSubtracao2 = scanner.nextFloat();

        System.out.printf("%s - %s = %s\n", valueSubtracao1, valueSubtracao2, valueSubtracao1 - valueSubtracao2);


        System.out.printf("\n\n\n");

        //divisao
        System.out.println("Informe o primeiro número para divisão");
        var valueDiv1 = scanner.nextFloat();

        System.out.println("Informe o segundo número para divisão");
        var valueDiv2 = scanner.nextFloat();

        System.out.printf("%s / %s = %s\n", valueDiv1, valueDiv2, valueDiv1 / valueDiv2);

        System.out.printf("\n\n\n");

        //Multiplicação
        System.out.println("Informe o primeiro número para divisão");
        var valueMultiplicacao1 = scanner.nextFloat();

        System.out.println("Informe o segundo número para divisão");
        var valueMultiplicacao2 = scanner.nextFloat();

        System.out.printf("%s * %s = %s\n", valueMultiplicacao1, valueMultiplicacao2, valueMultiplicacao1 * valueMultiplicacao2);
    }
}
