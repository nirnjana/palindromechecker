import java.util.*;

public class UseCase7DequePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Deque<Character> deque = new ArrayDeque<>();

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome (Deque)");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}