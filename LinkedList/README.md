LinkedList is a list where the nodes are linked together, each node contains data and a pointer that points to where in the memory the next node is placed
Benefits
-nodes don't have to be stored contiguously(right next to each other)
-When adding or removing nodes, the rest of the nodes in the list don't have to be shifted.

Head- the ponter to the first node
Tail- points to null or nullptr indicating the end of the list

Disadvantages
It's bad for searching

Characteristics
1st node is called a head and the last node is called a tail

Operations Performed
Initialisation - by creating a head node with a reference to the first node.Each subsequent node contains the value and a refernce of the next node.
Insering Elements - elements can be inserted at the head, tail or a specific position in the LinkedList.
Deleting Elements- by updating the reference of the previous node to point to the next node, effectively removing the current node from the list.
Searching for Elements- LinkedList can be searched for a specific element by starting from the head node and following the references to the next nodes until the desired element is found.
Updating elements- updated by modifying the value of a specific node
Traversing elements - The elements of a linkedlist can be traversed by starting from the head node and following the refernces to the next nodes until the end of the list is reached.
Reversing a linked list- the linked list can be reversed by updating the refernces of each node so that they point to the previous node instead of the next node

Double LinkedLists
[address | data | addresss] <-> [address | data | address]
Have two addresses one for the previous and the other one for the next
Requires a lot of memory 
Easier to traverse because it can traverse form head to tail or tail to head

Syntax

Applications of the Linked list: 
Different applications of linked lists are as follows:

Linked lists are used to implement stacks, queues, graphs, etc.
Linked lists are used to perform arithmetic operations on long integers.
It is used for the representation of sparse matrices.
It is used in the linked allocation of files.
It helps in memory management.
It is used in the representation of Polynomial Manipulation where each polynomial term represents a node in the linked list.
Linked lists are used to display image containers. Users can visit past, current, and next images.
They are used to store the history of the visited page.
They are used to perform undo operations.
Linked are used in software development where they indicate the correct syntax of a tag.
Linked lists are used to display social media feeds. 
Real-Life Applications of a Linked list: 
A linked list is used in Round-Robin scheduling to keep track of the turn in multiplayer games.
It is used in image viewer. The previous and next images are linked, and hence can be accessed by the previous and next buttons.
In a music playlist, songs are linked to the previous and next songs. 