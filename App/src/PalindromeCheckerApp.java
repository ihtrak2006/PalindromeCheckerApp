import java.util.Deque;
import java.util.ArrayDeque;

/**
 * =========================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 * removeFirst() and removeLast().
 *
 * If all characters match, the string is a palindrome.
 *
 * @author Developer
 * @version 7.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "refer";


        Deque<Character> deque = new ArrayDeque<>();


        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }


        boolean isPalindrome = true;


        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
