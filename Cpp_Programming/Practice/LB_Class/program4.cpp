#include<iostream>
using namespace std;

int main()
{
    float fValue1 = 0.0f;                   //To store the first input
    float fValue2 = 0.0f;                   //To store the second input
    float fResult = 0.0f;                   //To store the result

    cout<<"Enter the first number : \n";
    cin>>fValue1;

    cout<<"Enter the second number : \n";
    cin>>fValue2;

    fResult = fValue1 + fValue2;

    cout<<"Addition is : %d\n", fResult;

    return 0;
}