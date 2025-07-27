package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void operadores(String[] args){


    }


    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);

        System.out.printf("Você pode dirigir? (%s) \n", canDrive);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ola, informe o seu nome:");
//        String name = scanner.next();
//        System.out.println("Informe o sua idade:");
//        int age = scanner.nextInt();
//        System.out.println("Ola " +name + " sua idade é " +age);
    }


}