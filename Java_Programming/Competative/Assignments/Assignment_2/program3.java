package Competative.Assignments.Assignment_2;

//Accept one number from user if number is less than 10 then print Hello otherwise print Demo

import java.util.*;

class DisplayX 
{

    public void Display(int iNo)
    {
        if(iNo < 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }
    }
}

class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        DisplayX dobj = new DisplayX();

        dobj.Display(iValue);

    }
}