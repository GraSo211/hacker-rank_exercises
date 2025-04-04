import java.util.*;

public class Solution4 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner sc = new Scanner(System.in);
        int numberOfArrays = sc.nextInt();

        List<List<Integer>> arrayNumbers = new ArrayList<>();

        for (int i = 0; i < numberOfArrays; i++) {
            int lineNumbers = sc.nextInt();
            List<Integer> arrayNumber = new ArrayList<>();
            for (int j = 1; j <= lineNumbers; j++) {
                arrayNumber.add(sc.nextInt());
            }
            arrayNumbers.add(arrayNumber);
        }

        int numberOfQueries = sc.nextInt();

        List<List<Integer>> arrayQueries = new ArrayList<>();

        for (int i = 0; i < numberOfQueries; i++) {
            List<Integer> query = new ArrayList<>();
            query.add(sc.nextInt());
            query.add(sc.nextInt());
            arrayQueries.add(query);
        }

        for (List<Integer> i : arrayQueries) {
            int row = i.get(0) - 1;
            int column = i.get(1) - 1;
            try {
                System.out.println(arrayNumbers.get(row).get(column));

            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
