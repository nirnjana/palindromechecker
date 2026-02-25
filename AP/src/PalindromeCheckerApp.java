import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();

        if(word.equals(reversed)){
            System.out.println(word + " is a palindrome word.");
        } else {
            System.out.println(word + " is NOT a palindrome word.");
        }
        sc.close();
    }
}