#include<iostream>
#include<cstdlib>
using namespace std;

class queue
{
private:
	int front, rear, arr[5];
public:
	queue()
	{
		front = -1;
		rear = -1;
		for(int i = 0; i < 5; i++)
		{
			arr[i] = 0;
		}
	}
	bool isEmpty()
	{
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}
	bool isFull()
	{
		if(rear ==4)
			return true;
		else
			return false;
	}
	void enqueue(int val)
	{
		if(isFull())
		{
			cout << "queue is full" << endl;
		return;
		}
		else if(isEmpty())
		{
			front = rear = 0;
			arr[rear] = val;
		}
		else
		{
			rear++;

			arr[rear] = val;
		}

	}
	int dequeue()
	{
		int x;
		if(isEmpty())
		{
			cout << "queue is empty" << endl;
		return 0;
	}
		else if(front == rear)
		{
			x = arr[front];
			arr[front] = 0;
			rear = -1;
			front = -1;

			return x;
		}
		else
		{
			x = arr[front];
			arr[front] = 0;
			front++;
			return x;


		}
	}
	int count()
	{
		return (rear - front + 1);
	}
	void display()
	{
		cout<<"all values in the queue are"<<endl;
		for(int i=0;i<5;i++)
		{
			cout<<arr[i]<<" ";
		}
	}

};
int main()
{
	queue q1;
	int option, value;

	do
	{
		cout << "\n\n what operation do you want to perform.enter 0 to exit" << endl;
		cout << "1.enqueue()"<<endl;
		cout << "2.dequeue()"<<endl;
		cout << "3.isEmpty()"<<endl;
		cout << "4.isFull()"<<endl;
		cout << "5.count()"<<endl;
		cout << "6.display()"<<endl;
		cout << "7.clear"<<endl;

		cin >> option;
		switch(option)
		{
		case 0:
			break;
		case 1:cout<<"enqueue operation \nenter an item to enqueue"<<endl;
		cin>>value;
		q1.enqueue(value);
			break;
		case 2:
			cout<<"dequeue operation \ndequeued value:"<<q1.dequeue()<<endl;
			
			break;
		case 3:	if(q1.isEmpty())
			cout << "queue is empty" << endl;
			else
			{
				cout<<"queue is not empty"<<endl;
			}
			break;
		case 4:if(q1.isFull())
			cout << "queue is full" << endl;
			else
			{
				cout<<"queue is not full"<<endl;
			}
			break;
		case 5:
			cout<<"count operation \ncount of items in queue:"<<q1.count()<<endl;
			       
			break;
		case 6:
			cout<<"display function called"<<endl;
			q1.display();
			break;
		case 7:
			system("cls");
			default:
			cout<<"enter proper operation number"<<endl;
			break;
		}

	}
	while(option != 0);

	return 0;
}





