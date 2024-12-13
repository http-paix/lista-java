/*
O cardápio de uma lanchonete é o seguinte:
        +--------------------+--------+---------+
        | Produto            | Código | Preço   |
        +--------------------+--------+---------+
        | Cachorro-quente    | 100    | R$ 1,20 |
        | Bauru simples      | 101    | R$ 1,30 |
        | Bauru com ovo      | 102    | R$ 1,50 |
        | Hambúrguer         | 103    | R$ 1,20 |
        | Cheeseburguer      | 104    | R$ 1,30 |
        | Refrigerante       | 105    | R$ 1,00 |
        +--------------------+--------+---------+
Faça um programa que leia várias vezes o código e a quantidade do produto para formar um
pedido. Calcule e mostre o valor total do pedido. Considere que o pedido pode conter vários
produtos em diferentes quantidades e que o pedido será encerrado quando o código zero é
digitado.
*/

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        float valor = 0;
        
        while (true) {
            System.out.print("Digite o código do produto: ");
            int cod = validarInt(tec);

            if (cod == 0) {
                tec.close();
                break;
            }

            System.out.print("Quantidade: ");
            int qtd = validarInt(tec);

            switch (cod) {
                case 100:
                    valor += 1.2 * qtd;
                    break;
                case 101:
                    valor += 1.3 * qtd;
                    break;
                case 102:
                    valor += 1.5 * qtd;
                    break;
                case 103:
                    valor += 1.2 * qtd;
                    break;
                case 104:
                    valor += 1.3 * qtd;
                    break;
                case 105:
                    valor += qtd;
                    break;
                default:
                    System.out.println("Código inválido. Digite novamente.");
                    break;
            }
        }
        System.out.printf("%nValor total do pedido: R$ %.2f", valor);
    }
    private static int validarInt(Scanner tec) {
        int num;
        while (true) {
            try {
                num = tec.nextInt();
                
                return num;
                
            } catch (Exception e) {
                System.out.print("Entrada inválida. Digite novamente: ");
                tec.nextLine();
            }
        }
    }
}