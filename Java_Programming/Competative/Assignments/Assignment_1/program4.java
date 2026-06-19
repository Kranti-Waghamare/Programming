//Accept one number and check is divisble by 5 or not
import java.util.*;

class DivisionX
{
    public boolean Check(int iNo)
    {
        if((iNo % 5) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        DivisionX dobj = new DivisionX();
    
        bRet = dobj.Check(iValue);

        if(bRet == true)
        {
            System.out.println("Divisible by 5");
        }
        else
        {
            System.out.println("Not divisible by 5");
        }
    }
}