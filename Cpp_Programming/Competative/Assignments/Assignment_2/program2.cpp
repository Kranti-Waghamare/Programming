//Accept one number from user and print that number of * on screen 

#include<iostream>
using namespace std;

void Display(int iNo)
{
    //write updator
    while(iNo > 0)
    {
        cout<<"*";
        iNo--;
    }
}

int main()
{
    int iValue = 0;
    
    cout<<"Enter the number";
    cin>>iValue;

    Display(iValue);

    return 0;
}