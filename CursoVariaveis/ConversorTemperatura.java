import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Cº: ");
        int celsius = scanner.nextInt();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em graus Fahrenheit é " + fahrenheit);
    }
}