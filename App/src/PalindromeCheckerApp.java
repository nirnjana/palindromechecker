import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
        }

        String reversed = "";
        while(!stack.isEmpty()){
            reversed += stack.pop();
        }

        if(input.equals(reversed)){
            System.out.println(input + " is a palindrome (using stack).");
        } else {
            System.out.println(input + " is NOT a palindrome (using stack).");
        }
        sc.close();
    }
}