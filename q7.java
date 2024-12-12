/*
João é um pescador. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo
regulamento de pesca do seu estado (50 quilos), ele deve pagar uma multa de R$ 4,00 por quilo
excedente. João precisa que você faça um programa que leia o peso de peixes e diga a quantidade
excedente e o valor da multa para tal quantidade.
 */

 import java.util.Scanner;

 public class q7 {
     public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println();
        
        System.out.print("Digite o peso dos peixes: ");
        float peso = tec.nextFloat();

        tec.close();

        if (peso>50) {
            float excedente = peso - 50;

            float multa = excedente * 4;
            System.out.printf("Você deve uma multa de R$ %.2f pelos %.3f kg excedentes.", multa, excedente);
        }
        else {
            System.out.println("Você não pagará multa.");
        }
    }
 }
 