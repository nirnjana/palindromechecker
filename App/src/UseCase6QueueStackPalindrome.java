import java.util.*;

public class UseCase6QueueStackPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Enqueue and Push
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome (Queue + Stack)");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}