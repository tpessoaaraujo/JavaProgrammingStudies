import java.util.Random;
import java.util.Scanner;

public class SenhaPredefinida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        long min = 10000000L;
        long max = 99999999L;

        String senhaPredefinida = random.nextLong(max - min + 1) + "";
        System.out.println("Sua senha predefinida foi gerado com sucesso!" +
                "\nAnote: " + senhaPredefinida);

        System.out.println("\nDigite a senha: ");
        String senhaUsuario = scanner.nextLine();
        scanner.close();

        if (senhaPredefinida.equals(senhaUsuario)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
