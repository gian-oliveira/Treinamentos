package org.example;

import java.sql.SQLOutput;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {

    public static void exerciciosAula(String[] args) {
        var baseIdade = OffsetDateTime.now().getYear();

        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome");
        var name = scanner.next();

        System.out.println("Informe o ano do seu nascimento");
        var anoNascimento = scanner.nextInt();
        var idadeAtual = baseIdade - anoNascimento;

        System.out.printf("Ola %s você tem a idade de %s", name, idadeAtual);
    }

    public static void areaQuadrado(String[] args) {


        var scanner = new Scanner(System.in);

        System.out.println("Informe um dos lados do quadrado");
        var lado1 = scanner.nextInt();

        System.out.println("Informe o segundo lado do quadrado");
        var lado2 = scanner.nextInt();

        var somaQuadrado = lado1 * lado2;
        System.out.printf("A área total do quadrado é:" + somaQuadrado);

    }

    public static void diferencaDeIdadeDeDuasPessoas(String[] args){

        var scanner = new Scanner(System.in);
        System.out.println("informe o nome da primeira pessoa");
        var name1 = scanner.next();

        System.out.println("informe a idade da primeira pessoa");
        var idade1 = scanner.nextInt();

        System.out.println("informe o nome da segunda pessoa");
        var name2 = scanner.next();

        System.out.println("informe a idade da segunda pessoa");
        var idade2 = scanner.nextInt();

        var somaIdade = idade1 - idade2;

        System.out.printf("a diferença de idade entre o %s e o %s é de " + somaIdade + " anos", name1, name2);
    }

}
