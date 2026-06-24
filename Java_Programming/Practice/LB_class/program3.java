/*
    Algorithm
    START
        Accept first number as No1
        Accept second number as No2
        Perform addition of No1 & No2
        Display the result

    STOP
*/


package Practice.LB_class;

import java.util.Scanner;

class program3 
{
    public static void main(String A[])
    {
        int i, j, k;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        i = sobj.nextInt();

        System.out.println("Enter the second number : ");
        j = sobj.nextInt();

        k = i + j;

        System.out.println("Addition is : "+k);

    }
}
