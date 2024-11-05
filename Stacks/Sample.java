import java.util.Stack;

public class Sample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();


        stack.push("coconut");
        stack.push("pineapple");
        stack.push("passion");
        stack.push("mango");
        stack.push("Pawpaws");

        //System.out.println(stack.empty());

        //removes the top item, if empty it will throw an Empty Stack operation
        //stack.pop();
        //String myFav = stack.pop();
        //System.out.println("My favourite is " + myFav);
        //System.out.println(stack.peek());

        // Returns the 1-based position from the top of the stack where the object is located
        //if the object is not found it returns -1
        System.out.println(stack.search("Pawpaws"));
        System.out.println(stack);
    }
}