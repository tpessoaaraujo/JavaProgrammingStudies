import java.util.Scanner;

public class ConversorRealDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor atual da cotação do dólar: ");
        double valorDolar = scanner.nextDouble();

        System.out.println("Digite o valor em R$ que deseja converter: ");
        double valorReal = scanner.nextDouble();

        double valorConvertido = valorReal / valorDolar;

        System.out.println("O valor em dólares é US$" +  valorConvertido);
    }
}
