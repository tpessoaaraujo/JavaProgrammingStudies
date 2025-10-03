import java.util.Scanner;

public class CadastroLivros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String categoriaDescricao;

        System.out.println("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.println("\nDigite o nome do autor: ");
        String autor = scanner.nextLine();

        System.out.println("\nDigite o número de páginas: ");
        int paginas = scanner.nextInt();

        System.out.println("\nDigite o preço: ");
        double preco = scanner.nextDouble();

        System.out.println("\nF - Ficação / N - Não-Ficção / T - Tecnologia / H - História");
        System.out.println("Digite a letra correspondente a categoria do livro: ");
        char letraCategoria = scanner.next().charAt(0);
        letraCategoria = Character.toUpperCase(letraCategoria);

        switch (letraCategoria) {
            case 'F': categoriaDescricao = "Ficção";
                break;
            case 'N': categoriaDescricao = "Não-Ficção";
                break;
            case 'T': categoriaDescricao = "Tecnologia";
                break;
            case 'H': categoriaDescricao = "História";
                break;
            default:
                categoriaDescricao = "Categoria não cadastrada";
        }

        System.out.println("\nO livro \"" + titulo + "\" de " + autor +
                " foi cadastrado com sucesso. \nEle possui " + paginas + " páginas, custa R$" + preco +
                " e pertence à categoria " + categoriaDescricao + ".");
    }
}