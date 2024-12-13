/*
15. Faça um programa que leia e valide as seguintes informações, mantendo o usuário preso até que digite um valor válido:
- Nome: maior que 3 caracteres;
- Idade: entre 0 e 150;
- Salário: maior que zero;
- Sexo: “f” ou “m”;
- Estado Civil: “s”, “c”, “v”, “d”.
*/

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String nome;
        int idade;

        do {
            System.out.println("Digite o seu nome: ");
            nome = tec.nextLine();
        } while (nome.length() <= 3);

        do {
           System.out.print("Digite a sua idade: "); 
            idade = tec.nextInt();
        } while (condition);
        

        
        tec.close();

        
    }
}