import java.util.Scanner;

// Faça um programa que peça o raio de um círculo, calcule e mostre sua área.

public class q2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Informe o valor do raio: ");
        float r = tec.nextFloat();

        tec.close();

        double pi = Math.PI;

        double area = pi * r * r;

        System.out.println("Aárea do círculo é: " + area);
    }
}