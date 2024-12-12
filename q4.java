import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite o valor da temepratura em graus Fahrenheit: ");
        float f = tec.nextFloat();

        float c = 5 * (f - 32) / 9;

        System.out.println("A temperatura em graus Celsius é: " + c);
        tec.close();
    }
}
