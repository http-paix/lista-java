/*
 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de
um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo
usando este link (em minutos).
 */

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println();

        System.out.print("Digite o tamanho do arquivo (em MB): ");
        float tamanhoMB = tec.nextFloat();

        System.out.print("Digite a velocidade de um link de Internet (em Mbps): ");
        int velocidade = tec.nextInt();

        tec.close();

        float tamanhoMb = tamanhoMB * 8;
        float tempoSegundos = tamanhoMb / velocidade;

        int minutos = (int) tempoSegundos / 60;
        int segundosRestantes = (int) tempoSegundos % 60;

        System.out.printf("Tempo de download aproximado: %dmin e %ds", minutos, segundosRestantes);
    }
}
