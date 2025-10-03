import java.util.Scanner;

public class VerificacaoAcessoSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoAcesso = 2023;
        int nivelPermissaoMinimo = 1;
        int nivelPermissaoMaximo = 3;

        System.out.println("Digite o código de acesso: ");
        int codigoDigitado = scanner.nextInt();
        System.out.println("Digite o nível de acesso: ");
        int nivelPermissao = scanner.nextInt();
        scanner.close();

        boolean codigoAcessoValido = codigoDigitado == codigoAcesso;
        boolean nivelPermissaoValido = nivelPermissao >= nivelPermissaoMinimo && nivelPermissao <= nivelPermissaoMaximo;

        if (codigoAcessoValido && nivelPermissaoValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado. Motivo(s): ");
            if(!codigoAcessoValido){
                System.out.println("- Código de acesso incorreto.");
            }
            if(!nivelPermissaoValido){
                System.out.println("- Nível de permissão inválido.");
            }
        }
    }
}
