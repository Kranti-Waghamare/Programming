package Competative.Assignments.Assignment_2;

//Accept one number from user and print that number of * on screen 

import java.util.*;

class DisplayX
{
    void Display(int iNo)
    {
        //write updator
        while(iNo > 0)
        {
            System.out.print("*");
            iNo--;
        }
    }
}

class program2 
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
