#include <iostream>
using namespace std;

//def of a node in a singly linkedList
    struct Node{
        int data;

        //pointer to the next node in the list
        Node* next;

        //Constructor to initialise the node with data
        Node(int data)
        {
            this -> data = data;
            this -> next = nullptr;
        }
    };

    void traverseLinkedList(Node* head){
        //Start from the head of the linkedlist
        Node* current = head;

        //traverse until reching the end(nullptr)
        while (current != nullptr){
            //print the data of the current node
            cout<< current -> data << " ";

            //Move to the next node
            current = current->next;
        }
        cout << std::endl;
    }

int main(){
    //example usage
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);

    traverseLinkedList(head);
    
};