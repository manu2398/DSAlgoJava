import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in) ;
        
        int n = scn.nextInt() ;
        int m = scn.nextInt() ;
        
        int[][] arr = new int[n][m] ;
        
        for(int i=0; i<n; i++)
            for(int j=0; j<m;j++)
                arr[i][j] = scn.nextInt() ;
            
            
        int[][] dp = new int[n][m] ;        
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1) ;
        }
        
        int ans = 0 ;      
        for(int i=0; i<n; i++){
            
            int localAns = goldMine(i, 0, arr, dp) ;
            
            ans = Math.max(ans, localAns) ; // running for each row
        }
        
        System.out.print(ans) ;
        
    }
    
    public static int goldMine(int r, int c, int[][] arr, int[][] dp){
        
        int n = arr.length; int m = arr[0].length ;
        
        if(r<0 || r>=n){
            return 0 ;
        }
        
        if(c==m-1){
            return arr[r][c] ;
        }
        
        
        if(dp[r][c] != -1){
            return dp[r][c] ;
        }
        
        int x = goldMine(r-1, c+1, arr, dp) ; //upper diagonal
        int y = goldMine(r, c+1, arr, dp) ; // horizontal
        int z = goldMine(r+1, c+1, arr, dp) ; // lower diagonal
        
        dp[r][c] = arr[r][c] + Math.max(x, Math.max(y,z)) ;
        
        return dp[r][c] ;
        
    }

}
