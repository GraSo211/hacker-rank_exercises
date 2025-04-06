import java.util.*;

public class Solution5 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner sc = new Scanner(System.in);

        int numberOfQueries = sc.nextInt();

        for (int i = 0; i < numberOfQueries; i++) {
            int gameSize = sc.nextInt();
            int gameLeap = sc.nextInt();
            for (int j = 0; j < gameSize; j++) {
                int[] gameArray = new int[gameSize];
                gameArray[j] = sc.nextInt();
                
            }

            System.out.print(true);
        }

    }

}