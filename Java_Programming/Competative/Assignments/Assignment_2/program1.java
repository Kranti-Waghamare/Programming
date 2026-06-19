package Competative.Assignments.Assignment_2;

//Accept one number from user and print that number of * on screen 

import java.util.*;

class DisplayX
{
    void Display(int iNo)
    {
        int iCnt = 0;

        //write updator
        while(iCnt <= iNo)
        {
            System.out.print("*");
            iCnt++;
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

        dobj.Display(iValue);

    }
}