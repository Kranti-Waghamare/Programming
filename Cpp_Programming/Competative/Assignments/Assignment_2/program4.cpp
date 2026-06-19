//Accept two number from user and display the first number in second number of 

//Input : 12 5
//Output : 12 12 12 12 12

//Input : -2 3
//Output : -2 -2 -2

#include<iostream>
using namespace std;

void Display(int iNo, int iFrequency)
{
    int iCnt = 0;
    
    //write updator
    for(iCnt = 1; iCnt <= iFrequency; iCnt++)
    {
        cout<<iNo<<"\n";
    }
}

int main()
{
    int iValue = 0;
    int iCount = 0;

    cout<<"Enter the number\n";
    cin>>iValue;

    cout<<"Enter the Frequency\n";
    cin>>iCount;

    Display(iValue, iCount);

    return 0;
}