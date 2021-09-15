import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in) ;

    int n = scn.nextInt() ;
    int m = scn.nextInt() ;

    int[][] arr = new int[n][m] ;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt() ;
      }
    }

    int[][] dp = new int[n][m] ;

    for (int i = 0; i < n; i++) {
      Arrays.fill(dp[i], -1) ;
    };

    int ans = mincost(0, 0, n - 1, m - 1, arr, dp) ;

    System.out.print(ans) ;

  }

  public static int mincost(int sr, int sc, int dr, int dc, int[][] arr, int[][] dp) {
    // int count = 0;
    // count ++ ;
    // System.out.println("Hello "+"=>" + count ) ;
    
    if (sr > dr || sc > dc) {
      return Integer.MAX_VALUE;
    }

    if (sr == dr && sc == dc ) {

      return arr[dr][dc];

    }

    if (dp[sr][sc] != -1) {

      return dp[sr][sc] ;
    }

    int ans = 0 ;

    int hori = mincost(sr, sc + 1, dr, dc, arr, dp) ;

    int vert = mincost(sr + 1, sc, dr, dc, arr, dp) ;

    ans += arr[sr][sc] + Math.min(hori, vert) ;

    dp[sr][sc] = ans ;

    return ans ;

  }

}
