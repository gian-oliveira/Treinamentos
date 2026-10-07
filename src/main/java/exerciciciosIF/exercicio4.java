package exerciciciosIF;

import java.util.Scanner;

public class exercicio4 {
    //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
    //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.


    public static void main2(String[] args) {
        int horaInicial;
        int horaFinal;
        int duracaoTotal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial do jogo");
        horaInicial = sc.nextInt();

        System.out.println("Digite a hora Final do jogo");
        horaFinal= sc.nextInt();


        duracaoTotal = horaFinal - horaInicial;

        if(duracaoTotal < 1) {
            System.out.println("Digite a hora final do jogo maior que 1");
        }

        System.out.println("o jogo durou cerca de "+ duracaoTotal +" hora(s)" );


        sc.close();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }

}
