/*
 Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule e mostre
seu peso ideal. Use a fórmula:
PesoIdeal = 72.7 ∙ altura − 58
 */

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println();
        
        System.out.print("Digite a sua altura em metros: ");
        float altura = tec.nextFloat();

        tec.close();

        double pesoIdeal = 72.7 * altura - 58;

        System.out.printf("O seu peso ideal é: %.3f kg.", pesoIdeal);
    }
}
