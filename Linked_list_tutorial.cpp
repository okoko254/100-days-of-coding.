#include<iostream>
#include<cstdlib>// without this exit won't be defined
using namespace std;

//define a node with two members
struct Node{
	int data;//member1-integer data
	Node*next;//member2-pointer(address)
	
	//constructor to initialize the node
	Node(int data):data(data),next(NULL){}
};
 //create a new node
Node* createNode(int data)//this function returns a pointer to the node
{
	Node*newNode=new Node(data);// instead of (Node)malloc(sizeof(Node)); which is used in c
	if(!newNode){
		cout<<"memory allocation failed"<<endl;
		exit(1);
	}
	newNode->data=data;
	newNode->next=NULL;
	return newNode;
}
   
   //print the nodes
void printList(Node*node){
	while(node){
		cout<<node->data<<" ";
		node=node->next;
	}
	cout<<"null";
}

int main(int argc, char** argv)
{ //Node(int data):data(data),next(NULL){} it helps here
	Node*node1=createNode(3);
	Node*node2=createNode(6);
	Node*node3=createNode(12);
	Node*node4=createNode(1);
	
	node1->next=node2;
    node2->next=node3;
    node3->next=node4;
    
    printList(node1);
    
    //free the memory
    //in c use free keyword
    delete(node1);
    delete(node2);
    delete(node3);
    delete(node4);
    
			
	
	return 0;
}