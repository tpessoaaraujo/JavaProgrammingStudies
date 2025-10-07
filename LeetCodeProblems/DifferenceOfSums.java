// Access my solution on LeetCode here:
// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/solutions/7257483/difference-of-sums-by-tpessoaaraujo-5yif

import java.util.Scanner;

public class DifferenceOfSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num2 = 0;

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int m = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            }
        }
        int totalSum = (int) n * (n + 1) / 2;
        int result = totalSum - 2 * num2;

        System.out.println("\nIntervalo [1, " + n + "] \nA soma de todos os números inteiros no intervalo não divisiveis por " + m
                + " - A soma de todos os números inteiros no intervalo divisiveis por " + m + ". ");
        System.out.println("Resultado: " + result);
    }
}