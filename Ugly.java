package com.tgt.igniteplus;
import java.util.Scanner;
//To check if a number is ugly or not
public class Ugly {
    public static void main(String args[])
    {
        System.out.println("Enter any number\n");
        Scanner scan = new Scanner(System.in);
        Integer inputNumber = scan.nextInt();
        checkUglyNumber(inputNumber);
    }
    public static void checkUglyNumber(Integer inputNumber)
    {
        int num = inputNumber;
        while(num != 1)
        {
            if (num % 2 == 0)
                num /= 2;
            else if (num % 3 == 0)
                num /= 3;
            else if (num % 5 == 0)
                num /= 5;
            else
            {
                System.out.println(inputNumber + " is not an Ugly Number");
                return;
            }
        }
        System.out.println(inputNumber + " is an Ugly Number");
    }
}