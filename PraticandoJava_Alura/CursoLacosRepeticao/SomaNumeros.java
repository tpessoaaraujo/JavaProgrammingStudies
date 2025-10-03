public class SomaNumeros {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int valor : valores) {
            soma += valor;
        }
        System.out.println("A soma total das receitas é: " + soma);
    }
}
