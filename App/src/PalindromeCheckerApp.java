import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    // Method to check palindrome using String reverse
    public static boolean checkReverse(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    // Method to check palindrome using Stack
    public static boolean checkStack(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) stack.push(c);
        String reversed = "";
        while(!stack.isEmpty()) reversed += stack.pop();
        return str.equals(reversed);
    }

    // Method to check palindrome using Deque
    public static boolean checkDeque(String str){
        Deque<Character> deque = new ArrayDeque<>();
        for(char c : str.toCharArray()) deque.addLast(c);
        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long start, end;

        start = System.nanoTime();
        checkReverse(input);
        end = System.nanoTime();
        System.out.println("Reverse method took: " + (end-start) + " ns");

        start = System.nanoTime();
        checkStack(input);
        end = System.nanoTime();
        System.out.println("Stack method took: " + (end-start) + " ns");

        start = System.nanoTime();
        checkDeque(input);
        end = System.nanoTime();
        System.out.println("Deque method took: " + (end-start) + " ns");

        sc.close();
    }
}