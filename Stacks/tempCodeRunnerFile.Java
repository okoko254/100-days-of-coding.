import java.util.Stack;
import java.util.Scanner;

public class BalancedParentheses{
    public static boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()){
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(' )||
                    (ch == ']' && top != '[' )||
                    (ch == '}' && top != '{' ))
                     {
                        return false;
                     }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args){
        System.out.println("---Balanced Parentheses Check---");
        System.out.print("Enter an expression containing brackets([] or () or {} ): ");
        String expression = scanner.nextline();

        if (isBalanced(expression) == true){
            System.out.println("The expression is balanced");
        }
        else {
            System.out.println("The expression is not balanced.");
        }
        
    }
}
