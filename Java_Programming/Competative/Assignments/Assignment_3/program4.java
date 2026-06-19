package Competative.Assignments.Assignment_3;

//Accept one charachter from user and convert that case of that character.
//Input : a      Output: A
//Input : A      output: a

import java.util.*;

class DisplayX
{
    public void DisplayConvert(char cValue)
    {
        if(cValue >= 'a' && cValue <= 'z')
        {
            System.out.println((char)(cValue - 32));   
        }        
            
        else if(cValue >= 'A' && cValue <= 'Z')
        {
            System.out.println((char)(cValue + 32));       
        }
    }
}

class program4 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char CValue = '\0';

        System.out.println("Enter the Character : ");
        CValue = sobj.next().charAt(0);

        DisplayX dobj = new DisplayX();

        dobj.DisplayConvert(CValue);
    }
}
