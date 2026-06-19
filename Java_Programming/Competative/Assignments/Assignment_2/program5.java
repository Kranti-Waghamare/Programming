package Competative.Assignments.Assignment_2;

//Accept number from user and check wheather number is even or odd

import java.util.*;

class DisplayX
{
    boolean CheckEven(int iNo)
    {
        if((iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program5 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        DisplayX dobj = new DisplayX();

        bRet = dobj.CheckEven(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
