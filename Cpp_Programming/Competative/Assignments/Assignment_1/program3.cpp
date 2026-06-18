//program to display 5 to 1 numbers on the screen

#include<iostream>
using namespace std;


int Display()
{
    int i = 0;

    i = 5;

    while( i >= 1)
    {
        cout<< i <<"\n";
        i--;
    }
}

int main()
{
    Display();
    return 0;
}