//Accept one number from user and print that number of * on screen

class DisplayX
{
    void Accept(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            System.out.print("*");
        }
    }
}

class program5
{
    public static void main(String A[])
    {
        int iValue = 0;

        iValue = 5;

        DisplayX dobj = new DisplayX();
        dobj.Accept(iValue);
    }
   
}