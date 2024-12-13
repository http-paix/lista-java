/*
*Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina e calcule a
sua média aritmética. O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a situação. A atribuição de conceitos e situações obedece à tabela abaixo:

Média Aritmética | Conceito | Situação
[9.0 e 10.0)     |    A     | Aprovado com Distinção
[7.5 e 9.0)      |    B     | Aprovado
[6.0 e 7.5)      |    C     | Aprovado
[4.0 e 6.0)      |    D     | Reprovado
[0.0 e 4.0)      |    E     | Reprovado
*/

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float n1 = tec.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float n2 = tec.nextFloat();
        
        tec.close();

        float media = (n1 + n2) / 2;

        char conceito = 'X';
        String situacao = "";

        if (media>=9 && media<=10) {
            conceito = 'A';
            situacao = "Aprovado com Distinção";
        }
        else if (media>=7.5 && media<9) {
            conceito = 'B';
            situacao = "Aprovado";
        }
        else if (media>=6 && media<7.5) {
            conceito = 'C';
            situacao = "Aprovado";
        }
        else if (media>=4 && media<6) {
            conceito = 'D';
            situacao = "Reprovado";
        }
        else {
            conceito = 'E';
            situacao = "Reprovado";
        }

        System.out.printf("""
                - Notas do(a) estudante: %.1f e %.1f
                - Média aritmética do(a) estudante: %.1f
                - Conceito: %c
                - Situação: %s
                """, n1, n2, media, conceito, situacao);
    }
}