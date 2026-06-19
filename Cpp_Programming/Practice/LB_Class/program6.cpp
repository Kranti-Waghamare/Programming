#include<iostream>
using namespace std;

float AddTwoNumbers(
                        float fNo1,      //First number
                        float fNo2       //second number
                    )
{
    float fAns = 0.0f;

    fAns = fNo1 + fNo2;                  //perform addition 
    
    return fAns;
}

int main()
{
    float fValue1 = 0.0f;                   //To store the first input
    float fValue2 = 0.0f;                   //To store the second input
    float fResult = 0.0f;                   //To store the result

    cout<<"Enter the first number : \n";
    cin>>fValue1;

    cout<<"Enter the second number : \n";
    cin>>fValue2;

    fResult = AddTwoNumbers(fValue1 , fValue2);

    cout<<"Addition is : %d\n", fResult;

    return 0;
}