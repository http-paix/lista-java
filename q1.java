/*
 * Faça um programa que peça as 4 notas bimestrais de um estudante e mostre a média aritmética entre elas.
 */

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        float somatorio = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.printf("Digite a %da nota: ", i);
            float nota = tec.nextFloat();

            somatorio += nota;
        }
        tec.close();

        double media = somatorio / 4;

        System.out.println("A média aritmética das 4 notas bimestrais do estudante é: " + media);
    }
}