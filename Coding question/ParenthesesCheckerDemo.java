import java.util.Scanner;
import java.util.Stack;

public class ParenthesesCheckerDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Parentheses for balancing");
        String str = sc.nextLine();

        
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
                stack.push(str.charAt(i));

            }
            else if(!stack.empty() && ((str.charAt(i)==')' && stack.peek()=='(') || 
            (str.charAt(i)==']' && stack.peek()=='[' )|| (str.charAt(i)=='}' && stack.peek()=='{'))){
                stack.pop();
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        if(stack.empty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalanced");
        }
        sc.close();

    }
}