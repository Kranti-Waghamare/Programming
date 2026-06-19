//Accept number from user and check wheather number is even or odd

#include<iostream>
using namespace std;

typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL CheckEven(int iNo)
{
    if((iNo % 2) == 0)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;

    cout<<"Enter the number\n";
    cin>>iValue;

    bRet = CheckEven(iValue);

    if(bRet == TRUE)
    {
        cout<<"Number is Even\n";
    }
    else
    {
        cout<<"Number is odd\n";
    }

    return 0;
}