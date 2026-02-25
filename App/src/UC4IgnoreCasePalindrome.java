import java.util.Scanner;

public class UC4IgnoreCasePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String input = sc.nextLine();

        input = input.toLowerCase();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("It is a Palindrome (Ignoring Case)");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        sc.close();
    }
}