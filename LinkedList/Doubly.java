package LinkedList;

class Node {
    int data; //to store value or data
    Node prev;
    Node next;

    //So this can be a constructor;
    /*
    Node(int d){
        data = d;
        prev = next = null;
    }//I expected something like this.data = data, what's going on?
 */
//and this too can be a constructork;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    
    }
}

//Class to manage the doubly linkedlist
public class Doubly {
    //Function to traverse the doubly linked list in forward direction
    static void forwardTraversal(Node head){
        //Start traversal from the head of the list
        Node curr = head;

        //Continue until the current node is null(end of the list)
        while (curr != null) {
            //Output data of the current node
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

    static void backwardTraversal(Node tail){
        //Start traversal from the tail of the list
        Node curr = tail;

    }
}
public classDy {
    public static void main(String[] args) {
        
    }
    
}
