/*
19. Em uma competição de salto em distância cada atleta tem direito a cinco saltos. O resultado do
atleta será determinado pela média aritmética dos cinco saltos. Você deve fazer um programa que
receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe o nome,
os saltos e a média dos saltos. O programa deve ser encerrado quando não for informado o nome
do atleta. A saída do programa deve ser conforme o exemplo abaixo:
Atleta: Felipe Pinto
Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m
Resultado:
Atleta: Felipe Pinto

Saltos: 6.5 - 6.1 - 6.2 - 5.4 - 5.3
Média dos saltos: 5.9 metros

*/

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Atleta: ");
        String nome = tec.nextLine();

        if (nome.isEmpty()) {
            System.out.println("Fim do programa.");
        } else {
            float[] saltos = new float[5];

            saltos[0] = lerSalto(tec, "Primeiro salto: ");
            saltos[1] = lerSalto(tec, "Segundo salto: ");
            saltos[2] = lerSalto(tec, "Terceiro salto: ");
            saltos[3] = lerSalto(tec, "Quarto salto: ");
            saltos[4] = lerSalto(tec, "Quinto salto: ");

            tec.close();

            System.out.println("Resultado: \nAtleta: " + nome);
            System.out.print("\nSaltos: ");

            float somatorio = 0;

            for (int i = 0; i < 5; i++) {
                if (i == 4) {
                    System.out.print(saltos[i]);
                } else {
                    System.out.print(saltos[i] + " - ");
                }
                somatorio += saltos[i];
            }
            float media = somatorio / 5;

            System.out.printf("%nMédia dos saltos: %.1f metros", media);
        }
    }
    private static float lerSalto(Scanner tec, String mensagem) {
        System.out.print(mensagem);
        float salto = tec.nextFloat();

        return salto;
    }
}
