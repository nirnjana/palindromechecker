import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int left, int right) {
        if(left >= right) return true;
        if(str.charAt(left) != str.charAt(right)) return false;
        return isPalindrome(str, left+1, right-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if(isPalindrome(input, 0, input.length()-1)){
            System.out.println(input + " is a palindrome (Recursive).");
        } else {
            System.out.println(input + " is NOT a palindrome (Recursive).");
        }

        sc.close();
    }
}