import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize input: remove non-alphanumeric, convert to lowercase
        String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(normalized).reverse().toString();

        if(normalized.equals(reversed)){
            System.out.println(input + " is a palindrome (normalized).");
        } else {
            System.out.println(input + " is NOT a palindrome (normalized).");
        }

        sc.close();
    }
}