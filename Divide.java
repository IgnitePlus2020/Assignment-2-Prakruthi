package com.tgt.igniteplus;
import java.util.Scanner;
public class Divide {
    public static void main(String[] args)
    {
        int a, b, c;
        System.out.println("\n Enter first number to divide\n");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        System.out.println("\n Enter second number to divide\n");
        Scanner in1=new Scanner(System.in);
        b=in1.nextInt();
        try
        {
            c = a/b;
            System.out.println( a +"/"+ b +"="+ c);
        } catch(ArithmeticException e){
            System.out.println("Second Argument Should not be Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Pass Proper Arguments");
        }
    }
}