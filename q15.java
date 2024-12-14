/*
Faça um programa que leia e valide as seguintes informações, mantendo o usuário preso até que digite um valor válido:
    - Nome: maior que 3 caracteres;
    - Idade: entre 0 e 150;
    - Salário: maior que zero;
    - Sexo: “f” ou “m”;
    - Estado Civil: “s”, “c”, “v”, “d”.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String nome;
        int idade;
        float salario;
        char sexo;
        char civil;

        do {
            System.out.println("Digite o seu nome (deve conter mais que 3 caracteres e nenhum número): ");
            nome = tec.nextLine();

        } while (nome.length() <= 3 || possuiNumero(nome));

        idade = validarIdade(tec);

        salario = validarSalario(tec);

        tec.nextLine();

        do {
            System.out.print("Digite o seu sexo ('m' ou 'f'): ");

            String aux = tec.nextLine();
            sexo = aux.charAt(0);

        } while (!(sexo == 'f' || sexo == 'm'));

        do {
            System.out.print("Digite o seu estado civil ('s', 'c', 'v', 'd'): ");
            String aux = tec.nextLine();
            civil = aux.charAt(0);

        } while (!(civil == 's' || civil == 'c' || civil == 'v' || civil == 'd'));

        tec.close();

        System.out.println("\nCadastro realizado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        System.out.println("Estado Civil: "
                + (civil == 's' ? "Solteiro" : civil == 'c' ? "Casado" : civil == 'v' ? "Viúvo" : "Divorciado"));
    }

    private static int validarIdade(Scanner tec) {
        int idade;

        while (true) {
            System.out.print("Digite sua idade (entre 0 e 150): ");

            try {
                idade = tec.nextInt();

                if (idade >= 0 && idade <= 150) {
                    return idade;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                tec.nextLine();
            }
        }
    }

    private static float validarSalario(Scanner tec) {
        float salario;

        while (true) {
            System.out.print("Digite o seu salário (deve ser maior que zero): ");

            try {
                salario = tec.nextFloat();

                if (salario > 0) {
                    return salario;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                tec.nextLine();
            }
        }
    }

    private static boolean possuiNumero(String str) {
        for (char c : str.toCharArray()) {

            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}