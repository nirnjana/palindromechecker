import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();
        for(char c : input.toCharArray()){
            list.add(c);
        }

        boolean isPalindrome = true;
        while(list.size() > 1){
            if(!list.removeFirst().equals(list.removeLast())){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(input + " is a palindrome (using LinkedList).");
        } else {
            System.out.println(input + " is NOT a palindrome (using LinkedList).");
        }
        sc.close();
    }
}