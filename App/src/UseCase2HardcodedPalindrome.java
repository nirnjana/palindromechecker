public class UseCase2HardcodedPalindrome {

    public static void main(String[] args) {

        String word = "madam";

        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}