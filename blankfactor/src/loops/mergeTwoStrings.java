package loops;

import java.util.Scanner;

public class mergeTwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        String result = "";

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            result += word1.charAt(i);
            result += word2.charAt(i);
        }

        System.out.println(result);
    }
}



