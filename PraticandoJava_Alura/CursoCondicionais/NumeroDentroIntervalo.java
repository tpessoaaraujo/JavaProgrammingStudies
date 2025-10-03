import java.util.Scanner;

public class NumeroDentroIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        int valorEmprestimo = scanner.nextInt();
        scanner.close();

        if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000) {
            System.out.println("O valor " + valorEmprestimo + " está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + valorEmprestimo + " não está dentro do intervalo permitido para empréstimo.");
        }
    }
}
