import java.util.Scanner;

public class AlunoAprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double somaNotas = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite a " + i + "ª nota do aluno: ");
            nota = scanner.nextDouble();
            somaNotas += nota;
        }
        scanner.close();
        double media = somaNotas / 4;

        if (media >= 7) {
            System.out.println("O aluno teve média " + media + " e foi aprovado!");
        } else if (media >= 5) {
            System.out.println("O aluno teve média " + media + " e está de recuperação!");
        } else {
            System.out.println("O aluno teve média " + media + " e foi reprovado!");
        }
    }
}