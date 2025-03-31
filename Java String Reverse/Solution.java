
/* 
 A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        boolean isPalindrome = true;
        char[] charArray = A.toCharArray();

        for (int i = 0; i < A.length() / 2; i++) {
            if (charArray[i] != charArray[A.length() - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Yes" : "No");
    }
}