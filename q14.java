/*
Uma barraca de rua está vendendo morangos e maçãs com a seguinte tabela de preços:

| Fruta   | Até 5 Kg         | Acima de 5 Kg    |
|---------|------------------|-------------------|
| Morango | R$ 2,50 por Kg   | R$ 2,20 por Kg    |
| Maçã    | R$ 1,80 por Kg   | R$ 1,50 por Kg    |

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
receberá ainda um desconto de 10% sobre o total. Escreva um programa para ler a quantidade
(em Kg) de morangos e a quantidade (em Kg) de maçãs adquiridas e escreva o valor a ser pago
pelo cliente.
*/

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Quantos kg de morango? ");
        float pesoMorango = tec.nextFloat();

        System.out.print("Quantos kg de maçã? ");
        float pesoMaca = tec.nextFloat();

        tec.close();

        float valor = 0;
        if (pesoMorango > 5) {
            valor += pesoMorango * 2.2;
        } else {
            valor += pesoMorango * 2.5;
        }

        if (pesoMaca > 5) {
            valor += pesoMaca * 1.5;
        } else {
            valor += pesoMaca * 1.8;
        }

        if ((pesoMorango + pesoMaca) > 8 || valor > 25) {
            valor = valor * 90 / 100;
        }

        System.out.printf("Valor: R$ %.2f", valor);
    }
}