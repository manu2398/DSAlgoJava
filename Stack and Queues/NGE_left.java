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
        
        int[] aux = new int[n] ;
        
        for(int i=0; i<n; i++){
            
            while(stk.size()>0 && stk.peek() <= arr[i]){
                stk.pop() ;
            }
            
            if(stk.size() == 0) {
                aux[i] = -1 ;
            } else {
                aux[i] = stk.peek() ;
            }

            stk.push(arr[i]) ;
            
        }
        
        for(int i=0; i<n; i++)
            System.out.println(aux[i]) ;
     }
}
