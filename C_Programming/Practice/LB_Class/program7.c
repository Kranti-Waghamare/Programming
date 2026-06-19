//////////////////////////////////////////////////////////////////////
//
// Include required header files 
//
//////////////////////////////////////////////////////////////////////

#include<stdio.h>

//////////////////////////////////////////////////////////////////////
//
// function name :  AddTwoNumbers
// Input :          Float, Float
// Output :         Float
// Description :    Perform addition of two floats
// Date :           08/05/2026
// Author :         Kranti Laxman Waghamares
//
//////////////////////////////////////////////////////////////////////

float AddTwoNumbers(
                        float fNo1,          //first number
                        float fNo2           //second number
                    )
{
    float fAns = 0.0f;                      //variable to store result

    fAns = fNo1 + fNo2;                     //Perform Addition
    
    return fAns;
}

//////////////////////////////////////////////////////////////////////
//
// Application to perform Addition of 2 float values 
//
//////////////////////////////////////////////////////////////////////

int main()
{
    float fValue1 = 0.0f;                   //To store the first input
    float fValue2 = 0.0f;                   //To store the second input
    float fResult = 0.0f;                   //To store the result

    printf("Enter first number : \n");
    scanf("%f",&fValue1);

    printf("Enter second number : \n");
    scanf("%f",&fValue2);

    fResult = AddTwoNumbers(fValue1, fValue2);            
    
    printf("Addition is : %f\n",fResult);

    return 0;
}

//////////////////////////////////////////////////////////////////////
//
// Input : 10.0  11.0
// Output : 21.0
//
//////////////////////////////////////////////////////////////////////