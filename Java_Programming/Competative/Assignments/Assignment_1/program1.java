//program to divide two numbers

package Programming.Java_Programming.Competative.Assignments.Assignment_1;

import java.util.*;

class DivideX
{
    public int Divide(int iNo1, int iNo2)
    {
        int iAns = 0;

        if(iNo2 == 0)
        {
            return -1;
        }

        iAns = iNo1 / iNo2;

        return iAns;
    }
}

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DivideX dobj = new DivideX();

        int iValue1 = 0;
        int iValue2 = 0;
        int iRet = 0;

        System.out.println("Enter Dividend Number :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Divisor Number");
        iValue2 = sobj.nextInt();

        iRet = dobj.Divide(iValue1, iValue2);

        System.out.println("Division is :" +iRet);

        
    }    
}
