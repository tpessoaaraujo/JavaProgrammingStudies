import java.util.Scanner;

public class ConsultaDescontos {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        scanner.close();

        if (valorCompra >= 100) {
            System.out.println("Desconto de 10% aplicado.");
            double valorCompraDesconto = valorCompra - (valorCompra * 0.10);
            System.out.println("Novo valor: R$ " +  valorCompraDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado.\nValor total: R$ " + valorCompra);
        }
    }
}
