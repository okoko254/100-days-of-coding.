Linear data structure that follows FIFO
an ordered list of elements of similar data types

Operations Performed on Queue
Enqueue - adding an element at the back
Dequeue - removing an element at the front
Peek - inspecting an element without removing it
isEmpty 
size

Applications of Queue: 
Different applications of Queue are as follows:

Queue is used for handling website traffic.
It helps to maintain the playlist in media players.
Queue is used in operating systems for handling interrupts.
It helps in serving requests on a single shared resource, like a printer, CPU task scheduling, etc.
It is used in the asynchronous transfer of data e.g. pipes, file IO, and sockets.
 Queues are used for job scheduling in the operating system.
In social media to upload multiple photos or videos queue is used.
To send an e-mail queue data structure is used.
To handle website traffic at a time queues are used.
In Windows operating system, to switch multiple applications.

Queue Implementation using Java
Queue is an interface not a class therefore its instance can't be created
LinkedList and Priority Queues are the only collections that can be used to implement Queues
Use offer() to add, poll()to remove, and peek() ; better than add(), remove() and element() 

Priority Queues - serves elements with the highest priorities first
Displays items in ascending order or alphabetical order(for strings)
Use Collections.reverseOrder to reverse the order


Additional Concepts on Queue Implementation
Queue Behavior:

FIFO (First In, First Out): Queues are structured so the first element added is the first to be removed. This is useful for task scheduling, buffering, etc.
Priority Queue: In a priority queue, elements are ordered based on priority (e.g., natural ordering, which could be ascending for numbers or alphabetical for strings).
Methods Recap:

offer(): Adds an element to the queue; returns false if it fails.
poll(): Removes and returns the head of the queue (or null if the queue is empty).
peek(): Returns the head without removing it (returns null if empty).
Use offer, poll, and peek over add, remove, and element for handling potential empty or full queues gracefully.
Using PriorityQueue:

Natural Order: By default, integers will be in ascending order and strings in alphabetical order.
Reverse Order: To reverse the order, use PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());.