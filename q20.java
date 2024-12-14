/*
Para um valor N inteiro informado pelo usuário, faça um programa para imprimir uma saída como
a mostrada abaixo. Use uma função que receba um valor N inteiro e imprima até a N-ésima linha.
*/

import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int n = tec.nextInt();

        tec.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}