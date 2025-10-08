import java.util.Scanner;

public class NomeValido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        while (nome.length() < 3) {
            System.out.println("Nome inválido! Digite novamente.");
            nome = scanner.nextLine();
        }
        System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
    }
}
