package Competative.Assignments.Assignment_2;

//Accept two number from user and display the first number in second number of 

//Input : 12 5
//Output : 12 12 12 12 12

//Input : -2 3
//Output : -2 -2 -2

import java.util.*;

class DisplayX
{
    public void Display(int iNo, int iFrequency)
    {
        int iCnt = 0;
        
        //write updator
        for(iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.println(iNo);
        }
    }
}

public class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iCount = 0;

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        System.out.println("Enter the Frequency");
        iCount = sobj.nextInt();

        DisplayX dobj = new DisplayX();

        dobj.Display(iValue, iCount);
    }
}
