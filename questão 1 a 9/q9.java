/*
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros
quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário
a quantidades de latas de tinta a serem compradas e o preço total.
 */

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada (em metros quadrados): ");
        int area = tec.nextInt();

        tec.close();

        float litrosNecessarios = (float) area / 3;

        int latas = 0;
        if (litrosNecessarios % 18 == 0) {
            latas = (int) litrosNecessarios / 18;
        } else {
            latas = (int) litrosNecessarios / 18 + 1;
            System.out.println(latas);
        }

        int preco = latas * 80;

        System.out.println("Serão necessárias " + latas + " latas de tintas de 18 litros. ");
        System.out.println("Valor: R$ " + preco + ",00");
    }
}
