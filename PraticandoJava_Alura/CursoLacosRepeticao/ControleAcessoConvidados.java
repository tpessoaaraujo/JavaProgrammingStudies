import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ControleAcessoConvidados {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        List<String> listaDeConvidados = new ArrayList();

        while (true) {
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            String input = scanner.nextLine();

            if (input.equals("sair")) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (input.equals("ver")) {
                System.out.println("Lista atualizada de convidados: " + listaDeConvidados);
            }

            if (!input.equals("ver")) {

                boolean convidadoJaCadatrado = listaDeConvidados.stream()
                        .anyMatch(nomeNaLista -> nomeNaLista.equalsIgnoreCase(input));

                if (convidadoJaCadatrado) {
                    System.out.println("O nome " + input + " já está na lista de convidados.");
                } else {
                    listaDeConvidados.add(input);
                    System.out.println(input + " foi adicionado a lista de convidados.");
                }
            }
        }
    }
}
