import java.util.Scanner;

public class TentativasLogin {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int i = 2;
        final String SENHA_CORRETA = "1234";

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        while (!senha.equals(SENHA_CORRETA) && i >= 1) {
            System.out.println("Senha incorreta! Você tem " + i + " tentativa(s) restante(s).");
            i--;
            senha = scanner.nextLine();
            if (!senha.equals(SENHA_CORRETA) && i == 0) {
                System.out.println("Conta bloqueada temporariamente.");
                return;
            }
        }
        System.out.println("Senha correta! Acesso concedido!");
    }
}