package Competative.Assignments.Assignment_3;
//write a program which accept the number from user and print  factors of that number.
//Input : 24
//Output : 1 2 4 6 8 12 

import java.util.*;

class DisplayX
{
    public void  DisplayFactor(int iNo)
    {
        int i = 0;

        if(iNo <= 0)
        {
            iNo = -iNo;
        }

        for(i = 1; i <= iNo/2; i++)
        {
            if((iNo % i) == 0)
            {
                System.out.print(i);
            } 
        }
    }
}

class program2 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        DisplayX dobj = new DisplayX();

        dobj.DisplayFactor(iValue);

    }
}
