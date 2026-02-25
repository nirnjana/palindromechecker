import java.util.Scanner;

// Interface for Palindrome check
interface PalindromeChecker {
    boolean isPalindrome(String str);
}

// Implementation using String reverse
class ReversePalindromeChecker implements PalindromeChecker {
    @Override
    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new ReversePalindromeChecker();
        if(checker.isPalindrome(input)){
            System.out.println(input + " is a palindrome (OOP).");
        } else {
            System.out.println(input + " is NOT a palindrome (OOP).");
        }

        sc.close();
    }
}