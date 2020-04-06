package com.tgt.igniteplus;
//Calculate volume of cylinder
import java.util.Scanner;
public class Cylinder
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r=in.nextDouble();
        System.out.println("Enter the height:");
        double h=in.nextDouble();
        double  volume=((22*r*r*h)/7);
        System.out.println("Volume of Cylinder is: " +volume);

    }
}