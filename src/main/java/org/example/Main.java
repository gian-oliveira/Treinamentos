package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ola, informe o seu nome:");
        String name = scanner.next();
        System.out.println("Informe o sua idade:");
        int age = scanner.nextInt();
        System.out.println("Ola " +name + " sua idade é " +age);
    }
}