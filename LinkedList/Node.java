 package LinkedList;

 class Node {

    int data ;
    Node next ;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    //Constructor
    public LinkedList(){
        this.head = null;
    }

    //Method to traverse the linked list
    public static void traverseLinkedList (Node Head){
        //Start from the head of the LinkedList
        Node current = Head;
    
        //Traverse the linkedList til reaching the end
        while(current != null){
            //print the data of the current node
            System.out.println(current.data + " ");
    
            //move to the next Node
            current = current.next;

            //.next and .data are fields in the Node class
            //.next point to the next node while .data holds the integer data of that node
        }
    
        System.out.println();
    }

    public boolean searchLinkedList(Node head, int target){
        //Traverse the Linkedlist
        while (head != null){
            //check if the current node's data matches the target
            if (head.data == target){ //I thought head was only used to refer to the first node
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public int lengthLinkedList(Node head){
        int counter = 0;

        Node current = head;

        while (current != null) {
            counter ++;
            current = current.next;
        }
        return counter;
    }
    /*I really don't understand if the folloeing are keywords or variables
     * current, Node, head, .next, .data
     * what exactly is their role also, explain as used in this code
     */

     public Node InsertAtBeginning(Node head, int value){ //explain why these values have been placed in the parenheses
        //Create a newNode with the givven value
        Node newNode = new Node(value);

        //sets next pointer of the newNode to the current head
        newNode.next = head;

        //Move the head to point to the new node
        head = newNode;

        return head;
     }

     public Node InsertAtEnd(Node head, int value){
        //create a new node with the given value
        //why is it okay to name this newNode yet we use the same in the method insertAtBeginning
        Node newNode = new Node(value);

        //if the list is empty, make the new node the head
        if (head == null){
            return newNode;
        }

        //Traverse the list until the last node is reached
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        
        //link the new node to the current last node
        curr.next = newNode;

        return head;
     }

     public static Node inserPos(Node head, int pos, int data){
        if (pos < 1){
            System.out.println("Invalid position!");
            return head;
        }

        //special case for inserting at the head
        if (pos == 1) {
            Node temp = new Node(data);
            temp.next = head;
            return temp;
        }

        //Traverse the list to find the node before the insertion point
        Node prev = head;
        int count = 1;
        while(count < pos - 1 && prev != null){
            prev = prev.next;
            count++;
        }

        if (prev == null){
            System.out.println("Invalid position!");
            return head;
        }

        //insert the new node at the specified position
        Node temp = new Node(data);
        temp.next = prev.next;
        prev.next = temp;

        return head;
     }

     static Node removeFirstNode(Node head){
        if(head == null){
            return null; //list is empty
        }

        Node temp = head;
        head = head.next;

        return head;
     }

     Node removeLastNode(Node head){
        //if the list is empty return null
        if (head == null){
            return null;
        }

        //if the list has only one node, delete it and return null
        if (head.next == null){
            head = null;
            return null;
        }

        //Find the second last node
        Node second_last = head;
        while (second_last.next.next != null){
            second_last = second_last.next;//I would have thought about using a counter but this is genius!

            //Remove the last node
            second_last.next = null;

            //Return the modifier list
            return head;
            //I don't understand why we've been returning head only in almost every method
        }
     }

     public void deleteAtPosition(Node head, int position){
        //if the list is empty pr the position is invalid
        if(head == null || position < 1){
            return ; //why not return null;
        }

        //if the head needs to be deleted
        if (position == 1) {
            Node temp = head;
            head = head.next;
            temp = null;
            return;
        } //you'll have to explain this if block of code

        //Traverse to the node before the position to be deleted
        Node current = head;
        for(int i = 1; i < position - 1 && current != null; i++){
            current = current.next;
        }

        //if the position is out of range
        if (current == null || current.next == null){
            return;
        }

        //store the node to be deleted
        Node temp = current.next;

        //update the links to bypass the node to be deleted
        current.next = current.next.next;

        //delete the node
        temp = null;
     }
}
