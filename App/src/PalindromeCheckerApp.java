import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * Queue (FIFO - First In First Out)
 * Stack (LIFO - Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * If all characters match, the input string is confirmed
 * as a palindrome.
 *
 * @author Developer
 * @version 6.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "civic";


        Queue<Character> queue = new LinkedList<>();


        Stack<Character> stack = new Stack<>();


        for (char c : input.toCharArray()) {
            queue.add(c);     // enqueue
            stack.push(c);    // push
        }


        boolean isPalindrome = true;


        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
