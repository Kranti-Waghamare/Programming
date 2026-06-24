package Practice.LB_class;

import java.util.Scanner;

class program5 
{
    public static void main(String A[])
    {
        float fValue1 = 0.0f;
        float fValue2 = 0.0f;
        float fResult = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        fValue1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        fValue2 = sobj.nextInt();

        fResult = fValue1 + fValue2;

        System.out.println("Addition is : "+fResult);

    }
}
