//Accept one number and check is divisble by 5 or not

#include<iostream>
using namespace std;

typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL Check(int iNo)
{
    if((iNo % 5) == 0)
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
    cin>> iValue;

    bRet = Check(iValue);

    if(bRet == TRUE)
    {
        cout<<"Divisible by 5 \n";
    }
    else
    {
        cout<<"Not divisible by 5 \n";
    }

    return 0;
}