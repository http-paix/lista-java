/*
Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no
mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11%
para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
a. Salário bruto;
b. Quanto pagou ao INSS;
c. Quanto pagou ao sindicato;
d. O salário líquido.
 */

 import java.util.Scanner;

 public class q8 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println();
         
        System.out.print("Digite o valor da hora trabalhada: ");
        float valor = tec.nextFloat();

        System.out.print("Digite a quantidade de notas trabalhadas no mês: ");
        float qtd = tec.nextFloat();
 
        tec.close();
 
        float salarioBruto = valor * qtd;
        System.out.printf("a. Salário bruto: R$ %.2f%n", salarioBruto);

        float inss = salarioBruto * 8/100;
        System.out.printf("b. Quanto pagou ao INSS: R$ %.2f%n", inss);

        float sindicato = salarioBruto * 5/100;
        System.out.printf("c. Quanto pagou ao sindicato: R$ %.2f%n", sindicato);

        float salarioLiquido = salarioBruto * 89/100 - inss - sindicato;
        System.out.printf("d. O salário líquido. R$ %.2f%n", salarioLiquido);
    }
 }
 