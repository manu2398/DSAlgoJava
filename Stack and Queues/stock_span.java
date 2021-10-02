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
            
            while(stk.size()>0 && arr[i] > arr[stk.peek()]){.   // pop the stack until the currect idx arr value is greater than the stack inx array value
                stk.pop() ;
            }
            
            if(stk.size() == 0) {     // if the stack is empty than span is current idx + 1
                aux[i] = i+1 ;
            } else {
                aux[i] = i - stk.peek() ; // otherwise current idx minus the peek idx in the stack
            }

            stk.push(i) ;     // we will have to push the index in stack rather than the actual value.
            
        }
        
        for(int i=0; i<n; i++)
            System.out.println(aux[i]) ;
     }
}
