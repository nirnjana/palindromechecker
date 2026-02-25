import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String reversed = "";

        // Reverse the string manually
        for(int i = input.length() - 1; i >= 0; i--){
            reversed += input.charAt(i);
        }

        if(input.equals(reversed)){
            System.out.println(input + " is a palindrome (using manual reverse).");
        } else {
            System.out.println(input + " is NOT a palindrome (using manual reverse).");
        }
        sc.close();
    }
}