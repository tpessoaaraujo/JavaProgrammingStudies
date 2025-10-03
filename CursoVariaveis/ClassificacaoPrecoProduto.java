import java.util.Scanner;

public class ClassificacaoPrecoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String categoria;

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        if (preco <= 50) {
            categoria = "Ecônomico";
        } else if (preco > 50 && preco <= 200) {
            categoria = "Intermediário";
        } else {
            categoria = "Premium";
        }

        System.out.println("Categoria do produto: " + categoria);
    }
}