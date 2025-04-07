import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfQueries = sc.nextInt();

        for (int i = 0; i < numberOfQueries; i++) {
            int gameSize = sc.nextInt();
            int gameLeap = sc.nextInt();
            int[] gameArray = new int[gameSize];

            for (int j = 0; j < gameSize; j++) {
                gameArray[j] = sc.nextInt();
            }

            if (canWin(gameLeap, gameArray)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

   public static boolean canWin(int leap, int[] game) {
        return canWinFrom(0, leap, game, new boolean[game.length]);
    }

    public static boolean canWinFrom(int i, int leap, int[] game, boolean[] visited) {
        if (i >= game.length) return true;

        if (i < 0 || game[i] == 1 || visited[i]) return false;

        visited[i] = true;

        return canWinFrom(i + leap, leap, game, visited) ||
               canWinFrom(i + 1, leap, game, visited) ||
               canWinFrom(i - 1, leap, game, visited);
    }
}
