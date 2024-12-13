/*
Faça um programa que peça para N pessoas a sua idade, ao final o programa deverá verificar se a
média de idade do grupo varia entre 0 e 25, 26 e 60 ou maior que 60; e então, dizer se o grupo se
classifica com jovem, adulto ou idoso, conforme as variações indicadas.
*/

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int idade = 0, contador = 0, somatorio = 0;

        System.out.println("Digite a idade das pessoas. Quando terminar, digite -1.");

        while (idade>=0) {
            contador++;
            System.out.print("Idade da pessoa " + contador + ": ");
            idade = tec.nextInt();

            if (idade < 0) {
                break;
            }

            somatorio += idade;
        }

        tec.close();

        int media = somatorio / (contador - 1);

        System.out.println("Média do grupo: " + media);
        if (media <= 25) {
            System.out.println("Classificação do grupo: JOVEM");
        }
        else if (media >25 && media <= 60) {
            System.out.println("Classificação do grupo: ADULTO");
        }
        else {
            System.out.println("Classificação do grupo: IDOSO");
        }
        
    }
}

