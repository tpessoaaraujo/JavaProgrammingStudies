import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double somaNotas = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a " + i + "ª nota do aluno: ");
            nota = scanner.nextDouble();
            somaNotas += nota;
        }
        double media = somaNotas / 3;
        System.out.println("A média das notas é: " + media);
    }
}