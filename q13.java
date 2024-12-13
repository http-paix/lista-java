/*
*Faça um programa que faça cinco perguntas para uma pessoa sobre um crime. As perguntas são:
- Telefonou para a vítima?
- Esteve no local do crime?
- Mora perto da vítima?
- Devia para a vítima?
- Já trabalhou com a vítima?

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a
pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e
4 como “Cúmplice” e 5 como “Assassino”. Caso contrário, será classificado como “Inocente”.
*/

import java.util.Scanner;

public class q13 {
    public static int lerResposta(Scanner tec, String mensagem) {
        System.out.println(mensagem);
        String resposta = tec.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Responda as perguntas SOMENTE com 'sim' ou 'não'");

        int [] pergunta = new int[5];

        
        pergunta[0] = lerResposta(tec, "Telefonou para a vítima? ");
        pergunta[1] = lerResposta(tec, "Esteve no local do crime?");
        pergunta[2] = lerResposta(tec, "Mora perto da vítima?");
        pergunta[3] = lerResposta(tec, "Devia para a vítima?");
        pergunta[4] = lerResposta(tec, "Já trabalhou com a vítima?");

        tec.close();

        int somatorio = 0;

        for (int i = 0; i < pergunta.length; i++) {
            somatorio += pergunta[i];
        }

        String situacao = "";

        if (somatorio==2) {
           situacao = "Suspeito";
        }
        else if (somatorio==3 || somatorio==4) {
            situacao = "Cúmplice";
        }
        else if (somatorio == 5) {
            situacao = "Assassino";
        }
        else {
            situacao = "Inocente";
        }

        System.out.println("Classficação da participação no crime: " + situacao);
    }
}