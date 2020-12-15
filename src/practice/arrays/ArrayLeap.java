package practice.arrays;

import java.util.*;

public class ArrayLeap {

    // my solution was not taking account of the visited indexes
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int i = 0;
        int n = game.length-1;
        boolean canWin = false;
        while (i < n) {
            if (i+leap >= n) {
                canWin = true;
                break;
            }
            if (i+leap < n && game[i+leap] == 0)
                i += leap;
            else if (i+1 <= n && game[i+1] == 0)
                i++;
            /*else if (game[i-1] == 0)
                i--;*/
            else
                break;
        }
        return canWin;
    }

    // DFS
    private static boolean isSolvable(int m, int[] arr, int i) {
        if (i < 0 || arr[i] == 1) return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

        arr[i] = 1;
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            //System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
            System.out.println( (isSolvable(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}