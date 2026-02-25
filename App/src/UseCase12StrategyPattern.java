import java.util.Scanner;

public class UseCase12StrategyPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeStrategy strategy = new StackStrategy();

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (strategy.check(input))
            System.out.println("Palindrome (Strategy Pattern)");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}