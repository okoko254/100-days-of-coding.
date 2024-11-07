import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public String reversal(String input){
        Stack<Character> stack = new Stack<>();

        for(char i : input.toCharArray()){
            stack.push(i);
        }
        StringBuilder reversedString = new StringBuilder();

        while(!stack.isEmpty()){
            reversedString.append(stack.pop());
        }

        //converting it back to String
        return reversedString.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter a String to reverse (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")){
                System.out.println("Exiting... \nGoodBye :)");
                break;
            }

            //create an instance of ReverseString
            ReverseString reverser = new ReverseString();

            String reversed = reverser.reversal(input);

            System.out.println("Reversed String is: " + reversed);
   
        }

        scanner.close();
        
    }
}
