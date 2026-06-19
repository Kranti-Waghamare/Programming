//Accept one number from user and print that number of * on screen 

#include<iostream>
using namespace std;

void Display(int iNo)
{
    int iCnt = 0;

    //write updator
    while(iCnt <= iNo)
    {
        cout<<"*";
        iCnt++;
    }
}

int main()
{
    int iValue = 0;
    
    cout<<"Enter the number\n";
    cin>>iValue;

    Display(iValue);

    return 0;
}