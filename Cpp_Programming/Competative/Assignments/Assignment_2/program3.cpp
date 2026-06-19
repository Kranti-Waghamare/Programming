//Accept one number from user if number is less than 10 then print Hello otherwise print Demo

#include<iostream>
using namespace std;

int Display(int iNo)
{
    if(iNo < 10)
    {
        cout<<"Hello";
    }
    else
    {
        cout<<"Demo";
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