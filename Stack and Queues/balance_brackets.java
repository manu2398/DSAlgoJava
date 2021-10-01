import java.io.*;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        
        Scanner scn = new Scanner(System.in) ;
        String str = scn.next() ;
        
        Stack<Character> stk = new Stack<>() ;
        
        for(int i=0; i<str.length(); i++){
            
            char ch = str.charAt(i) ;
            
            if(ch == '(' || ch == '[' || ch == '{'){. 
                stk.push(ch) ;    // pushing characters only if opening brackets are there
            }
            
            else if(ch == ')'){
                if(stk.isEmpty() == true || stk.peek()!='('){.   // if we receive a closing bracket look for the top ele , if it matches then pop it otherwise return false
                    System.out.print("false") ;
                    return ;
                } else {
                    stk.pop() ;
                }
            }
            
            else if(ch == '}'){
                if(stk.isEmpty() == true || stk.peek()!='{'){
                    System.out.print("false") ;
                    return ;
                } else {
                    stk.pop() ;
                }
            }
            
            else if(ch == ']'){
                if(stk.isEmpty() == true || stk.peek()!='['){
                    System.out.print("false") ;
                    return ;
                } else {
                    stk.pop() ;
                }
            }
       
        }
        
        if(stk.size()==0){
            System.out.print("true") ;   // for the case  ((). we have to check for empty stack.
        } else {
            System.out.print("false") ;
        }
        
     }
}
