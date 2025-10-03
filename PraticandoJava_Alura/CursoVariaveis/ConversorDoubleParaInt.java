import java.util.Scanner;

public class ConversorDoubleParaInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a converter: ");

        double valorDouble = scanner.nextDouble();
        int valorInt = (int) valorDouble;

        System.out.println("O valor inteiro é: " + valorInt);
    }
}