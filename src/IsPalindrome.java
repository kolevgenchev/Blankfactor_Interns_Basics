public class IsPalindrome {

    public boolean isPalindrome(String word) {
        boolean reversed = false;
        StringBuilder input1 = new StringBuilder();
        input1.append(word);
        input1.reverse();
        if (input1.toString().equals(word)) {
            reversed = true;
        }
        return reversed;
    }
}
