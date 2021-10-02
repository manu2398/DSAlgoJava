import java.io.*;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
         
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt() ;
        
        int[] arr = new int[n] ;
        
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt() ;
        
        Stack<Integer> stk = new Stack<>() ;
        
        int[] nge = new int[n] ;
        
        for(int i=n-1; i>=0; i--){
            
            while(stk.size()>0 && stk.peek() <= arr[i]){
                stk.pop() ;
            }
            
            if(stk.size() == 0) {
                nge[i] = -1 ;
            } else {
                nge[i] = stk.peek() ;
            }

            stk.push(arr[i]) ;
            
        }
        
        for(int i=0; i<n; i++)
            System.out.println(nge[i]) ;
     }
}
