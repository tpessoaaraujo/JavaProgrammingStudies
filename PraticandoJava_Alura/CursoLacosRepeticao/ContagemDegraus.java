import java.util.Scanner;

public class ContagemDegraus{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int quantidadeDeDegraus = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= quantidadeDeDegraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!");
    }
}