#include <stdio.h>

int main(){
    int myInt;
    printf("Program to Determine the Size of an Integer and the size of it's memory adress on the server \n \n");
    printf("Enter an integer value: ");
    scanf("%d",&myInt);

    printf("Value of integer : %d\n", myInt);
    printf("Size of integer: %lu bytes\n", sizeof(myInt));
    printf("Adress to your integer: %p\n", &myInt);
    printf("Size of the adress to your integer: %lu bytes \n", sizeof(&myInt));

    return 0;
}

//this code only runs in C because python and Java run on
//abstraction level above specific/direct memory allocation.