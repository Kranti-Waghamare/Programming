//write a program which accept the number from user and print Even factors of that number.
//Input : 36
//Output : 2 4 6 12 18

#include<iostream>
using namespace std;

int DisplayEvenFactor(int iNo)
{
    int i = 0;

    if(iNo <= 0)
    {
        iNo = -iNo;
    }

    for(i = 1; i <= iNo/2; i++)
    {
        if((iNo % i == 0) && (i % 2 == 0))
        {
            cout<< i <<"\t";
        } 
    }
}

int main()
{
    int iValue = 0;

    cout<<"Enter the number\n";
    cin>> iValue;

   DisplayEvenFactor(iValue);

    return 0;
}