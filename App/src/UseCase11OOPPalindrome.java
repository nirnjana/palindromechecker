import java.util.Scanner;

public class UseCase11OOPPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (service.checkPalindrome(input))
            System.out.println("Palindrome (OOP Service)");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}