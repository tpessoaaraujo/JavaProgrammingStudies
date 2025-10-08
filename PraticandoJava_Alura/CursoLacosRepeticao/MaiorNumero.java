import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço: ");
        String[] numerosStr = scanner.nextLine().split(" ");
        scanner.close();
        int maiorValor = Integer.MIN_VALUE;

        for (String numStr : numerosStr) {
            int num = Integer.parseInt(numStr);
            if (num > maiorValor) {
                maiorValor = num;
            }
        }
        System.out.println("Maior valor: " + maiorValor);
    }
}
