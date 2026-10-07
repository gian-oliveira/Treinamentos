package exerciciciosIF;

import java.util.Scanner;

public class exercicio5 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoProduto;
        int qtdProduto;


        System.out.println("Digite o código do produto");
        codigoProduto = sc.nextInt();

        System.out.println("Digite a quantidade do produto escolhido");
        qtdProduto = sc.nextInt();

        double total;
        if(codigoProduto == 1){
           total = qtdProduto * 4.00;
        } else if (codigoProduto == 2){
            total = qtdProduto * 4.50;
        } else if (codigoProduto == 3){
            total = qtdProduto * 5.00;
        } else if (codigoProduto == 4) {
            total = qtdProduto * 2.00;
        }
        else {
            total = qtdProduto * 1.5;
        }

        System.out.println("O valor total do produto escolhido foi de: " +total);

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
