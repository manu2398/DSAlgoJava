
import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~
    // Complexity O(qXn)
    public static int[] getModifiedArray(int length, int[][] queries) {
        // write your code here
        int[] res = new int[length];
        int q = 0;
        while(q!=queries.length) {
            for(int i=queries[q][0]; i<=queries[q][1]; i++){
                res[i]+=queries[q][2];
            }
            q++;
        }
        return res;
    }
  
  //Complexity O(n)
  public static int[] getModifiedArray(int length, int[][] queries) {
        // write your code here
        int[] res = new int[length];
        for(int i=0; i<queries.length;i++){
            res[queries[i][0]]+=queries[i][2];
            if(queries[i][1]+1 < length)
                res[queries[i][1]+1]-=queries[i][2];
        }
        int sum=0;
        for(int i=0; i<res.length; i++) {
            sum+=res[i];
            res[i] = sum;
        }
        
        return res;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int length = scn.nextInt();

        int nq = scn.nextInt();
        
        int[][] queries = new int[nq][3];

        for(int q = 0; q < nq; q++) {
            queries[q][0] = scn.nextInt();
            queries[q][1] = scn.nextInt();
            queries[q][2] = scn.nextInt();
        }


        int[] res = getModifiedArray(length, queries);

        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
