import java.util.Scanner;
import java.util.Stack;
 
public class ParenthesesChecker {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parentheses");
        String str = sc.nextLine();
        //  String str = "{[]})";
        
 
         //Declare a stack
         Stack<Character> stack = new Stack<Character>();
 
         //Traverse a string
         for(int i = 0; i < str.length(); i++) {
 
            /* If the current character is starting bracket,
               then push them in a stack
             */
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                   stack.push(str.charAt(i));
            } 
            /* 
               Else, If the stack is not empty,
               And current character is a closing bracket
               and top character of a stack is matching open bracket
               then pop it.
             */
            else if ( !stack.empty() && ((str.charAt(i) == ']' && stack.peek() == '[') || 
                        (str.charAt(i) == '}' && stack.peek() == '{') ||
                        (str.charAt(i) == ')' && stack.peek() == '('))) {
 
                   stack.pop();
 
             } else {
                  stack.push(str.charAt(i));
             }
         }
 
         if(stack.empty()) {
              System.out.println("Balanced");
         } else {
              System.out.println("Not balanced");
   
          }
          sc.close();
   }


}