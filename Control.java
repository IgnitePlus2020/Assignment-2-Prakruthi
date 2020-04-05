/* The following program calculates a bill in a cafe. It includes switch case and some control statements*/
package com.tgt.igniteplus;
import java.util.Scanner;
public class Control {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean quit= false;
        int sum=0;
        int donut=80,milkshake=120,cupcake=400,macaron=100;
        String order="";

        do{
            System.out.println("ITEM"+"\t\tPrice");
            System.out.println("1.Donut"+"\t\t"+"80");
            System.out.println("2.Milkshake"+"\t"+"120");
            System.out.println("3.Cupcake"+"\t"+"40");
            System.out.println("4.Macaron"+"\t"+"100");
            System.out.println("5.Quit");

            int choice=input.nextInt();

            switch(choice){
                case 1:System.out.println("Donut"+"\n");
                    sum=sum+donut;
                    order=order.concat("Donut"+"\n");
                    break;
                case 2:
                    System.out.println("Milkshake");
                    sum=sum+milkshake;
                    order=order.concat("Milkshake"+"\n");
                    break;
                case 3:
                    System.out.println("Cupcake");
                    sum=sum+cupcake;
                    order=order.concat("Cupcake"+"\n");
                    break;
                case 4:
                    System.out.println("Macaron");
                    sum=sum+macaron;
                    order=order.concat("Macaron"+"\n");
                    break;
                case 5:
                    quit=true;

                    break;
                default:
                    System.out.println("Wrong input");
            }

        }while(!quit);

        System.out.println("Your Orders are:\n"+order);
        System.out.println("Your total bill= "+sum+"rupees");
        System.out.println("Thank you!");





    }

}