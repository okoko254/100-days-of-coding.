#include<iostream>

using namespace std;
int main(int argc, char** argv)
{
	int myval=10;
	cout<<"value: "<<myval<<endl;
	cout<<"size of value: "<<sizeof(myval)<<endl;
	cout<<"address of the value: "<<&myval<<endl;
	cout<<"size of the address: "<<sizeof(&myval)<<endl;

	return 0;
}