/*
 Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
a. O produto do dobro do primeiro com metade do segundo.
b. A soma do triplo do primeiro com o terceiro.
c. O terceiro elevado ao cubo.
 */

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println();
        System.out.print("Digite o primeiro número inteiro: ");
        int int1 = tec.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int int2 = tec.nextInt();

        System.out.print("Digite um número real: ");
        double real = tec.nextInt();

        tec.close();

        //a
        float a = (2 * int1) * ((float)int2 / 2);
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + a);

        //b
        double b = (int1 * 3) + real;
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + b);

        //c
        double c = Math.pow(real, 3);
        System.out.println("O terceiro elevado ao cubo: " + c);
    }
}
