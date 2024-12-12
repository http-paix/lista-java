import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: ");
        float valor = tec.nextFloat();

        System.out.print("Digite a quantidade de notas trabalhadas no mês: ");
        float qtd = tec.nextFloat();

        tec.close();

        float salario = valor * qtd;

        System.out.println("O salário do mês é: R$ " + salario);
    }
}
