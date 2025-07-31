package org.example;

import java.util.Scanner;

public class Idade {
    public static void idade (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ola, informe o seu nome:");
        String name = scanner.next();
        System.out.println("Informe o sua idade:");
        int age = scanner.nextInt();
        System.out.println("Ola " +name + " sua idade é " +age);

    }
}
