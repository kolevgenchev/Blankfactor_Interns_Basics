package loops;

import java.util.Scanner;

public class checkTheSum {
        public static void main(String[] args) {
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

       /* public static void checkTheSumNegativeResult()
        {
            String firstWord = "acffefb";
            String secondWord = "cdxwba";
            String targetWord = "cddddb";
            int sum1 = 0;
            int sum2 = 0;
            int sum3 = 0;

            for (int i = 0; i < firstWord.length(); i++) {
                sum1 += firstWord.indexOf(i) - 97;
            }

            for (int i = 0; i < secondWord.length(); i++) {
                sum2 += secondWord.indexOf(i);
            }

            for (int i = 0; i < targetWord.length(); i++) {
                sum3 += targetWord.indexOf(i);
            }

            if (sum1 + sum2 == sum3)
            {
                System.out.println("true");
            } else
            {
                System.out.println("false");
            }

        }*/
    }


