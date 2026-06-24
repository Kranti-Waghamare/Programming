package Practice.LB_class;

import java.util.Scanner;

class program3 
{
    public static void main(String A[])
    {
        float i = 0.0f;
        float j = 0.0f;
        float k = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        i = sobj.nextInt();

        System.out.println("Enter the second number : ");
        j = sobj.nextInt();

        k = i + j;

        System.out.println("Addition is : "+k);

    }
}
