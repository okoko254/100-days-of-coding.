#include<iostream>
using namespace std; 

#define MAX 5
int top=-1;
int stack_arr[MAX];

void push(int data)
{
	if (top==MAX-1)
	{
		cout<<"stack overflow";
	}	
	
		top=top+1;
		stack_arr[top]=data;		
}

 int pop()
 {
 	int value;
 	if (top==-1)
	 {
	 	cout<<"stack underflow";
	 }
	

	
	  value=stack_arr[top];
	top=top-1;
	return value;

 }
 void print()
{
	
	if(top==-1)
	{
		cout<<"stack underflow\n";
		return;
	}
	for(int i=top;i>=0;i--)
		cout<<stack_arr[i];
}
		
int main()
{
push(7);	
push(9);
push(5);
push(6);	
push(1);

pop();
pop();
pop();
pop();






print();
	
	return 0;
}