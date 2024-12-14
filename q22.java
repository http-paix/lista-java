/*
Faça um programa que receba um endereço IP e informe se tal IP tem formato válido ou não. Use
uma função para realizar a validação, a função receberá o IP e retornará um valor lógico indicando
se o IP é válido ou não. No seu programa, o usuário poderá digitar quantos endereços IP quiser
validar, até que ele digite a palavra “sair”.
*/

import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um endereço IP ou 'sair' para sair do programa.");
            String ip = tec.nextLine();

            if (ip.equals("sair")) {
                System.out.println("Fim do programa.");
                tec.close();
                break;
            }

            if (ipValido(ip)) {
                System.out.println("Endereço IP válido.");
            } else {
                System.out.println("Endereço IP INVÁLIDO.");
            }
            System.out.println("-------------------------------------------");
        }
    }

    private static boolean ipValido(String ip) {
        String[] numeros = ip.split("\\.");

        if (numeros.length != 4) {
            return false;
        }

        for (String string : numeros) {
            try {
                int numero = Integer.parseInt(string);

                if (numero < 0 || numero > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}