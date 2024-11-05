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
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Balanced Parentheses Check---");
        System.out.print("Enter an expression containing brackets([] or () or {} ): ");
        String expression = scanner.nextL~ine();

        if (isBalanced(expression) == true){
            System.out.println("The expression is balanced");
        }
        else {
            System.out.println("The expression is not balanced.");
        }
        
    }
}

/*
 *  Balanced Parentheses Check
This algorithm checks if every opening bracket has a corresponding closing bracket in the correct order. We’ll use a stack to help us track unmatched opening brackets.

Algorithm:
Initialize an empty stack to hold opening brackets.
Iterate through each character in the expression:
If the character is an opening bracket ((, {, [), push it onto the stack.
If the character is a closing bracket (), }, ]):
Check if the stack is empty:
If it is, the expression is unbalanced, so return false.
Otherwise, pop the top element from the stack.
Check if the popped element matches the type of closing bracket:
If it doesn’t match, return false.
After the loop, check if the stack is empty:
If it is empty, all brackets were balanced, so return true.
If there are still elements in the stack, return false (unmatched opening brackets).
 */