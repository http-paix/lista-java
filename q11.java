/*
 * 11. As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe
contrataram para desenvolver o programa que calculará os reajustes. Assim, faça um programa
que recebe o salário de um colaborador e calcule o reajuste segundo o seguinte critério:
- Salários até R$ 280,00 (incluindo): aumento de 20%;
- Salários entre R$ 280,00 e R$ 700,00 (incluindo): aumento de 15%;
- Salários entre R$ 700,00 e R$ 1500,00 (incluindo): aumento de 10%;
- Salários acima de R$ 1500,00: aumento de 5%

Após o aumento ser realizado, informe na tela:
- O salário antes do reajuste;
- O percentual de aumento aplicado;
- O valor do aumento;
- O novo salário, após o aumento.
 */

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println();

        System.out.print("Digite o seu salário (em reais): ");
        float salario = tec.nextFloat();

        tec.close();

        float salarioAtual = salario;
        int percentual = 0;

        if (salario <= 280) {
            percentual = 20;
        } 
        else if (salario > 280 && salario <= 700) {
            percentual = 15;
        } 
        else if (salario > 700 && salario <= 1500) {
            percentual = 10;
        }
        else {
            percentual = 5;
        }

        float aumento = salario * percentual / 100;
        salarioAtual += aumento;

        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salario);
        System.out.printf("Percentual de aumento aplicado: %d por cento %n", percentual);
        System.out.printf("Valor do aumento: R$ %.2f%n", aumento);
        System.out.printf("Salário após o reajuste: R$ %.2f%n", salarioAtual);

    }
}
