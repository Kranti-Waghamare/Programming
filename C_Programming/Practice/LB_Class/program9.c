/*
    START 
        Accept number as No
        Divide No by 2
        If remainder is 0
            then print as Even
        otherwise
            print as Odd
    STOP
*/

#include<stdio.h>

void CheckEvenOdd(int iNo)
{
    int iRemainder = 0;

    iRemainder = iNo % 2;

    if (iRemainder == 0)
    {
        printf("Number is Even \n");
    }
    else
    {
        printf("Number is Odd \n");
    }

}

int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);
   
    CheckEvenOdd(iValue);

    return 0;
}