import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= numero ; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é " +  fatorial);
    }
}
