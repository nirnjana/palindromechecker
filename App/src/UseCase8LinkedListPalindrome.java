import java.util.Scanner;

public class UseCase8LinkedListPalindrome {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    public static boolean isPalindrome(Node head) {

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        Node left = head;
        Node right = prev;

        while (right != null) {
            if (left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        Node head = null, tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null)
                head = tail = newNode;
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        if (isPalindrome(head))
            System.out.println("Palindrome (LinkedList)");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}