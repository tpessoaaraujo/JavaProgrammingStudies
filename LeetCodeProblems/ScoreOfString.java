// Access my solution on LeetCode here:
// https://leetcode.com/problems/score-of-a-string/solutions/7237305/scoreofstring-by-tpessoaaraujo-i2ro

import java.util.Scanner;

public class ScoreOfString {
    public static void main(String[] args) {
        int score = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String textUser = input.nextLine();

        for (int i = 0; i< textUser.length()-1; i++){
            int difference = textUser.charAt(i)- textUser.charAt(i+1);
            score += Math.abs(difference);
        }
        input.close();
        System.out.println("\nO score do texto é " + score);    }
}