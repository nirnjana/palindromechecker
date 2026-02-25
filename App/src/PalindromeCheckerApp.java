import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();
        for(char c : input.toCharArray()){
            deque.addLast(c);
        }

        boolean isPalindrome = true;
        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(input + " is a palindrome (using deque).");
        } else {
            System.out.println(input + " is NOT a palindrome (using deque).");
        }
        sc.close();
    }
}