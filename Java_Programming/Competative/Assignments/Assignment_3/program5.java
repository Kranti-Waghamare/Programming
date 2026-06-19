package Competative.Assignments.Assignment_3;

//Accept one charachter from user and check whether that character is vowel (a,e,i,o,u) or not
//Input : E   Output : TRUE
//Input : D   Output : FALSE

import java.util.*;

class DisplayX
{
    public boolean CheckVowel(char cValue)
    {
        if(cValue == 'A' || cValue =='E'|| cValue =='I' || cValue == 'O' || cValue == 'U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program5 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char CValue = '\0';
        boolean bChar = false;

        System.out.println("Enter the character : ");
        CValue = sobj.next().charAt(0);

        DisplayX dobj = new DisplayX();

        bChar = dobj.CheckVowel(CValue);

        if(bChar == true)
        {
            System.out.println("It is vowel ");
        }
        else
        {
            System.out.println("It is not Vowel ");
        }

    }
}
