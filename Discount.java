package com.tgt.igniteplus;
//To calculate discount and price after discount
import java.util.Scanner;
public class Discount
{
    public static void main(String[] args)
        {

            double  dis,amount=0.0,mp,sp;
            System.out.println("Enter the marked price\n");
            Scanner in=new Scanner(System.in);
            mp=in.nextDouble();
            System.out.println("Enter the discount percentage\n");
            dis=in.nextDouble();
            System.out.println("Marked Price is "+mp);
            amount=(mp*dis)/100;
            System.out.println("Discount price is "+amount);
            sp=mp-amount;
            System.out.println("Selling price after discount is "+sp);

        }
    }
