/*
Faça um programa que leia um número indeterminado de valores, correspondentes a notas,
encerrando a entrada de dados quando for informado um valor igual a -1 (que não deve ser
armazenado). Após esta entrada de dados, faça:
a. Mostre a quantidade de valores que foram lidos;
b. Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
c. Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
d. Calcule e mostre a média aritmética dos valores;
e. Calcule e mostre a quantidade de valores acima da média calculada;
f. Calcule e mostre a quantidade de valores abaixo da média calculada;
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        List<Double> valores = new ArrayList<>();

        System.out.println("Digite os valores. Ao terminar, digite -1.");

        while (true) {
            double valor = tec.nextDouble();

            if (valor == -1) {
                tec.close();
                break;
            }

            valores.add(valor);
        }

        //a
        System.out.println("Quantidade de valores inseridos: " + valores.size());

        //b
        System.out.println("--------------------------------------------");
        for (Double numDouble : valores) {
            System.out.print(numDouble + "  ");
        }
        
        //c
        System.out.println("\n--------------------------------------------");
        for (int i = valores.size() - 1; i >= 0; i--) {
            System.out.println(valores.get(i));
        }

        //d
        System.out.println("--------------------------------------------");
        double somatorio = 0;
        for (int i = 0; i < valores.size(); i++) {
            somatorio += valores.get(i); 
        }

        double media = somatorio / valores.size();
        System.out.println("A média aritmética é: " + media);

        //e, f
        System.out.println("--------------------------------------------");
        int valoresAcima = 0, valoresAbaixo = 0;
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) > media) {
                valoresAcima++;
            }
            else if (valores.get(i) < media) {
                valoresAbaixo++;
            }
        }

        System.out.println("Quantidade de valores acima da média: " + valoresAcima);
        System.out.println("--------------------------------------------");
        System.out.println("Quantidade de valores abaixo da média: " + valoresAbaixo);
        
    }
}
