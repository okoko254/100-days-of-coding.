import java.util.Stack;

public class Stacks{
    public static void main(String[] args){
        Stack<E> myStack = new Stack(10);

        myStack.push('A');
        myStack.push('B');
        myStack.push('C');

        System.out.print("Stack: ");
        myStack.printStack();

        System.out.println("Pop: " + myStack.pop());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("isEmpty: " + myStack.isEmpty());
        System.out.println("Size: " + myStack.size());

    }

    class Stack{
        char[] Stack;
        int top;
        int capacity;

        public Stack(int capacity){
            this.capacity = capacity;
            this.Stack = new char[capacity];
            this.top = -1;
        }
    }
}