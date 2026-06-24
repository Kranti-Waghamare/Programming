package Practice.LB_class;

//////////////////////////////////////////////////////////////////////
//
// Include required packages and import files 
//
//////////////////////////////////////////////////////////////////////


import java.util.Scanner;

//////////////////////////////////////////////////////////////////////
//
// function name :  AddTwoNumbers
// Input :          Float, Float
// Output :         Float
// Description :    Perform addition of two floats
// Date :           24/06/2026
// Author :         Kranti Laxman Waghamares
//
//////////////////////////////////////////////////////////////////////

class DisplayX
{
    float AddTwoNumbers(
                            float fNo1, 
                            float fNo2
                        )
    {
        float fAns = 0;

        fAns = fNo1 + fNo2;

        return fAns;
    }
}

//////////////////////////////////////////////////////////////////////
//
// Application to perform Addition of 2 float values 
//
//////////////////////////////////////////////////////////////////////

class program8
{
    public static void main(String A[])
    {
        float fValue1 = 0.0f;
        float fValue2 = 0.0f;
        float fResult = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter the second number : ");
        fValue2 = sobj.nextFloat();

        DisplayX dobj = new DisplayX();

        fResult = dobj.AddTwoNumbers(fValue1, fValue2);

        System.out.println("Addition is : "+fResult);

    }
}

//////////////////////////////////////////////////////////////////////
//
// Input : 10.0  11.0
// Output : 21.0
//
//////////////////////////////////////////////////////////////////////