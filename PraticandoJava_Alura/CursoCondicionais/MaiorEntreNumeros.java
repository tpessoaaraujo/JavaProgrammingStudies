import java.util.Scanner;

public class MaiorEntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero =  scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundoNumero =  scanner.nextInt();
        scanner.close();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior número é " + primeiroNumero);
        } else if (primeiroNumero < segundoNumero) {
            System.out.println("O maior número é " + segundoNumero);
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}
