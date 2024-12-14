/*
Faça um programa que receba uma data no formato DD/MM/AAAA e mostre um texto no
formato DD de MêsPorExtenso de AAAA. Use uma função que recebe a data no primeiro formato
e retorne a data no segundo formato. No seu programa, o usuário poderá digitar datas até que ele
digite a palavra “sair”. Considere que o usuário sempre informará datas válidas.
*/

import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        while (true) {
            System.out.println("Digite uma data (no formato DD/MM/AAAA) ou 'sair' para sair do programa.");
            String data = tec.nextLine();

            if (data.equals("sair")) {
                System.out.println("Fim do programa.");
                break;
            }

            String[] aux = data.split("/");

            int dia = Integer.parseInt(aux[0]);
            int mes = Integer.parseInt(aux[1]);
            int ano = Integer.parseInt(aux[2]);

            String nomeMes = "";

            switch (mes) {
                case 1:
                    nomeMes = "Janeiro";
                    break;
                case 2:
                    nomeMes = "Fevereiro";
                    break;
                case 3:
                    nomeMes = "Março";
                    break;
                case 4:
                    nomeMes = "Abril";
                    break;
                case 5:
                    nomeMes = "Maio";
                    break;
                case 6:
                    nomeMes = "Junho";
                    break;
                case 7:
                    nomeMes = "Julho";
                    break;
                case 8:
                    nomeMes = "Agosto";
                    break;
                case 9:
                    nomeMes = "Setembro";
                    break;
                case 10:
                    nomeMes = "Outubro";
                    break;
                case 11:
                    nomeMes = "Novembro";
                    break;
                case 12:
                    nomeMes = "Dezembro";
                    break;
            }
            System.out.printf("Data por extenso: %d de %s de %d %n", dia, nomeMes, ano);
            System.out.println("---------------------------------------------");
        }
        tec.close();
    }
}