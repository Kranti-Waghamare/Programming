//Accept one number from user and print that number of * on screen

#include<iostream>
using namespace std;

void Accept(int iNo)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt <= iNo; iCnt++)
    {
        cout<<"*";
    }
}

int main()
{
    int iValue = 0;

   iValue = 5;

    Accept(iValue);

    return 0;
}