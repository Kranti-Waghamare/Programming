//write a program which accept one number from the user and print that number of even number on screen.
//Input : 7
//Output : 2 4 6 8 10 12 14

#include<iostream>
using namespace std;

int  PrintEven(int iNo)
{
    int iCnt = 0;

    if(iNo <= 0)
    {
        return -1;
    }

    for(iCnt = 0; iCnt <= iNo; iCnt++)
    {
        cout<<iCnt * 2<<"\n";
    }
}

int main()
{
    int iValue = 0;

    cout<<"Enter the number\n";
    cin>>iValue;

    PrintEven(iValue);

    return 0;
}