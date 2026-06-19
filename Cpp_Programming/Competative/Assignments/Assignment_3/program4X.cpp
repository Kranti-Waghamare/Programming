//Accept one charachter from user and convert that case of that character.
//Input : a      Output: A
//Input : A      output: a

#include <iostream>
using namespace std;

#include <ctype.h>

void DisplayConvert(char cValue)
{
    if(cValue >= 'a' && cValue <= 'z')
    {
        cout<< toupper(cValue);           //toupper method to do the lowercase to uppercase from ctype header file
    }
    else if(cValue >= 'A' && cValue <= 'Z')
    {
        cout<< tolower(cValue);          //t metholowerod to do the uppercase to lowecase from ctype header file
    }
}

int main()
{
    char CValue = '\0';

    cout<< "Enter the Character\n";
    cin>> CValue;

    DisplayConvert(CValue);

    return 0;
}