package loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // fizzBuzz();
        //loops.mergeTwoStrings();
        //isPalindrome();
        //loops.checkTheSum();
        return;
    }

    public static void isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        int flag = 0;
        int i = 0;
        for (int j = number.length() - 1 ; j >= 0; j--) {
            if (number.charAt(i) == number.charAt(j)) {
                flag++;
                i++;
            }
        }

        if(flag == number.length())
        {
            System.out.println("This number is a palindrome.");
        } else {
            System.out.println("This number is NOT a palindrome.");
        }
    }

    public static void mergeTwoStrings() {
/*
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        String resultString = "";

        int maxLength = Math.max(word1.length(), word2.length());

        while (maxLength > 0) {
            for (int i = 0; i < maxLength; i++) {
                resultString += word1.charAt(i);
                resultString += word2.charAt(i);
            }
        }*/
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        String result = "";

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            result += word1.charAt(i);
            result += word2.charAt(i);
        }

        /* second way to solving the problem
        int i = 0;
        while(Math.max(word1.length(), word2.length()) > 0)
        {
            result += word1.charAt(i);
            result += word2.charAt(i);
            i++;
        }*/

        System.out.println(result);
        /*
        StringBuilder resultString = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());

            for (int j = 0; j < minLength; j++) {

              resultString.append(word1.charAt(j));
                resultString.append(word2.charAt(j));
                //resultString += word1.charAt(j);
                //resultString += word2.charAt(j);
            }
            resultString.append(word1.substring(minLength)).append(word2.substring(minLength));
            */

    }

    public static String fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        //  int n = scanner.nextInt();
        int n = Integer.parseInt(scanner.nextLine());
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                arr.add(i, "FizzBuzz");

            } else if (i % 5 == 0) {
                arr.add(i, "Buzz");

            } else if (i % 3 == 0) {
                arr.add(i, "Fizz");

            } else {
                arr.add(i, String.valueOf(i));
            }
        }
        System.out.println(arr);
        return arr.toString();
    }

    public static void checkTheSum() {
        /*
        String firstWord = "abc";
        String secondWord = "cba";
        String targetWord = "cdb";

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for (int i = 0; i < firstWord.length(); i++) {
            sumA += (int) firstWord.charAt(i) - 97;
        }
           for (int j = 0; j < secondWord.length(); j++) {
                for (int k = 0; k < targetWord.length(); k++) {


                    sumB += secondWord.charAt(i) - 97;
                    sumC += targetWord.charAt(k) - 97;
                }
            }
        }
        System.out.println(sumA);*/
    Scanner scanner = new Scanner(System.in);

    String firstWord = "acb";
    String secondWord = "cba";
    String targetWord = "cdb";
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;

    // checkTheSumNegativeResult();

            for (int i = 0; i < firstWord.length(); i++) {
        sum1 += (int)firstWord.charAt(i) - 97;
    }
            for (int i = 0; i < secondWord.length(); i++) {
        sum2 += (int)secondWord.charAt(i) - 97;
    }
            for (int i = 0; i < targetWord.length(); i++) {
        sum3 += (int)targetWord.charAt(i) - 97;
    }

            if (sum1 + sum2 == sum3)
    {
        System.out.println("true");
    } else
    {
        System.out.println("false");
    }

    }
}
