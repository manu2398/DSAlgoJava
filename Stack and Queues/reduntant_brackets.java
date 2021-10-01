import java.io.*;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        
        Scanner scn = new Scanner(System.in) ;
        String str = scn.next() ;
        
        Stack<Character> stk = new Stack<>() ;
        
        for(int i=0; i<str.length(); i++){
            
            char ch = str.charAt(i) ;

            if(ch == ')'){ // check for closing bracket
                
                if(stk.peek() == '('){
                    System.out.print("true") ;
                    return ;
                }
                
                while(stk.peek() != '('){
                    stk.pop() ;
                }
                stk.pop() ; // pop out the closing bracket as well
            } else {
                stk.push(ch) ;
            }
            
        }
        
        System.out.print("false") ;
        
     }
}
