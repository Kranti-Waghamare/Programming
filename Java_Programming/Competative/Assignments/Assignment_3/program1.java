package Competative.Assignments.Assignment_3;

//write a program which accept one number from the user and print that number of even number on screen.
//Input : 7
//Output : 2 4 6 8 10 12 14

import java.util.*;

class DisplayX
{
    public void PrintEven(int iNo)
    {
        int iCnt = 0;

        if(iNo <= 0)
        {
            return;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println(iCnt * 2);
        }
      
    }
}

class program1 
{
   public static void main(String A[])
   {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        DisplayX dobj = new DisplayX();

        dobj.PrintEven(iValue);
   } 
}
