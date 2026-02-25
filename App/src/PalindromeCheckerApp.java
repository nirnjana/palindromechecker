import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()){
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        while(!queue.isEmpty()){
            if(!queue.remove().equals(stack.pop())){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(input + " is a palindrome (queue+stack).");
        } else {
            System.out.println(input + " is NOT a palindrome (queue+stack).");
        }
        sc.close();
    }
}