import java.util.Scanner;

public class UC5StringBuilderPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("It is a Palindrome (Using StringBuilder)");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        sc.close();
    }
}