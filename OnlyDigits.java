package com.tgt.igniteplus;
import java.util.Scanner;
//To check if the string contains only digits
public class OnlyDigits
{

    public static void main(String[] args)
    {
        Scanner input = null;
        try
        {
            input = new Scanner(System.in);
            System.out.println("Enter String : ");
            String string = input.next();
            int length = string.length();
            int count = 0;
            for (int i = 0; i < length; i++)
            {
                if (Character.isDigit(string.charAt(i)))
                {
                    count++;
                }
                else
                    {
                        break;
                    }
            }
            if (count == length)
            {
                System.out.println("String contains only digits.");
            }
            else
                {
                    System.out.println("String contains both digits and characters.");
                }
        }
        finally
        {
            if (input != null)
            {
                input.close();
            }
        }

    }

}