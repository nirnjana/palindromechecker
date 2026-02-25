import java.util.Scanner;

// Strategy interface
interface PalindromeStrategy {
    boolean check(String str);
}

// Concrete strategy 1: Reverse string
class ReverseStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}

// Concrete strategy 2: Using stack
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for(char c : str.toCharArray()) stack.push(c);
        String reversed = "";
        while(!stack.isEmpty()) reversed += stack.pop();
        return str.equals(reversed);
    }
}

// Context class
class PalindromeCheckerContext {
    private PalindromeStrategy strategy;
    public PalindromeCheckerContext(PalindromeStrategy strategy){
        this.strategy = strategy;
    }
    public boolean executeStrategy(String str){
        return strategy.check(str);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Using ReverseStrategy
        PalindromeCheckerContext context = new PalindromeCheckerContext(new ReverseStrategy());
        if(context.executeStrategy(input)){
            System.out.println(input + " is a palindrome (Strategy Pattern).");
        } else {
            System.out.println(input + " is NOT a palindrome (Strategy Pattern).");
        }

        sc.close();
    }
}