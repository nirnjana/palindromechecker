import java.util.Scanner;

public class UseCase10NormalizedPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        input = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed))
            System.out.println("Palindrome (Ignore Case & Space)");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}
