/*
    START
        Accept number as No
        If No is completely divisible by 2
            then print Even
        otherwise
            print Odd
    STOP


    START 
        Accept number as No
        Divide No by 2
        If remainder is 0
            then print as Even
        otherwise
            print as Odd
    STOP
*/

package Practice.LB_class;

import java.util.Scanner;

class program9 
{
   public static void main(String A[])
   {
        int iValue = 0;
        int iRemainder = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        iRemainder = iValue % 2;

        if(iRemainder == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
   } 
}
