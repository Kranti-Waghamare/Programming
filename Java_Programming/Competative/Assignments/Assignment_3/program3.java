package Competative.Assignments.Assignment_3;

//write a program which accept the number from user and print Even factors of that number.
//Input : 36
//Output : 2 4 6 12 18

import java.util.*;

class DisplayX
{
    public void DisplayEvenFactor(int iNo)
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
                System.out.println(i);
            } 
        }
    }
}


class program3 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number :");
        iValue = sobj.nextInt();

        DisplayX dobj = new DisplayX();

        dobj.DisplayEvenFactor(iValue);

    }
}
