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

class program4 
{
    public static void main(String A[])
    {
        //variable creation with default value
        float i = 0.0f, j = 0.0f, k = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        i = sobj.nextInt();

        System.out.println("Enter the second number : ");
        j = sobj.nextInt();

        k = i + j;

        System.out.println("Addition is : "+k);

    }
}
